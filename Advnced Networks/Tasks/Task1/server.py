"""
import socket
import threading

# Define host and port
host = '127.0.0.1'
port = 7012

# Starting Server
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((host, port))
server.listen()

# List to store connected clients
clients = []
nicknames = []
# Function to handle individual client connections
def handle_client(conn, addr):
    print(f"Connected by {addr}")
    with conn:
        while True:
            try:
                # Receive the message size
                size_data = conn.recv(4)  # Assuming message size is sent as a 4-byte integer
                if not size_data:
                    break
                # Convert the size data to integer
                message_size = int.from_bytes(size_data, byteorder='big')
                # Receive the actual message
                data = conn.recv(message_size)
                if not data:
                    break
                # Broadcast the message to other clients
                broadcast(data, conn)
            except Exception as e:
                print(f"Error occurred with {addr}: {e}")
                conn.close()
                clients.remove(conn)
                break

# Function to broadcast message to all clients except the sender
def broadcast(message, sender_conn):
    for client_conn in clients:
        if client_conn != sender_conn:
            try:
                client_conn.sendall(message)
            except:
                # If there's an error with a client, remove it from the list
                print("Removing client due to error.")
                clients.remove(client_conn)

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    # Bind the socket to the address and port
    s.bind((host, port))
    # Listen for incoming connections
    s.listen()
    print("Server is listening for connections...")
    while True:
        # Accept a connection
        conn, addr = server.accept()
        clients.append(conn)
        # Handle the client connection in a separate thread
        thread = threading.Thread(target=handle_client, args=(conn, addr))
        thread.start()


# Create a socket object
with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    # Bind the socket to the address and port
    s.bind((HOST, PORT))
    # Listen for incoming connections
    s.listen()
    print("Server is listening for connections...")
    while True:
        # Accept a connection
        client, address = server.accept()
        clients.append(conn)
        # Handle the client connection in a separate thread
        thread = threading.Thread(target=handle_client, args=(conn, addr))
        thread.start()

"""

"""
# -*- coding: utf-8 -*-
"""
#@author: ChatRoom ==> Server
"""

import socket
import threading

# Connection Data
host = '127.0.0.1'
port = 7000

# Starting Server
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((host, port))
server.listen()

# Lists For Clients and Their Nicknames
clients = []
nicknames = []

# Sending Messages To All Connected Clients
def broadcast(message):
    for client in clients:
        client.send(message)
        
# Handling Messages From Clients
def handle(client):
    while True:
        try:
            # Broadcasting Messages
            message = client.recv(1024)
            broadcast(message)
        except:
            # Removing And Closing Clients
            index = clients.index(client)
            clients.remove(client)
            client.close()
            nickname = nicknames[index]
            broadcast('{} left!'.format(nickname).encode('ascii'))
            nicknames.remove(nickname)
            break
        
# Receiving / Listening Function
def receive():
    while True:
        # Accept Connection
        client, address = server.accept()
        print("Connected with {}".format(str(address)))

        # Request And Store Nickname
        client.send('NICK'.encode('ascii'))
        nickname = client.recv(1024).decode('ascii')
        nicknames.append(nickname)
        clients.append(client)

        # Print And Broadcast Nickname
        print("Nickname is {}".format(nickname))
        broadcast("{} joined!".format(nickname).encode('ascii'))
        client.send('Connected to server!'.encode('ascii'))

        # Start Handling Thread For Client
        thread = threading.Thread(target=handle, args=(client,))
        thread.start()
        
receive()

"""













#work1

import socket

# Define host and port
HOST = '127.0.0.1'  # Standard loopback interface address (localhost)
PORT = 65432        # Port to listen on (non-privileged ports are > 1023)

# Create a socket object
with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    # Bind the socket to the address and port
    s.bind((HOST, PORT))
    # Listen for incoming connections
    s.listen()
    print("Server is listening for connections...")
    # Accept a connection
    conn, addr = s.accept()
    with conn:
        print(f"Connected by {addr}")
        while True:
            # Receive the message size
            size_data = conn.recv(4)  # Assuming message size is sent as a 4-byte integer
            if not size_data:
                break
            # Convert the size data to integer
            message_size = int.from_bytes(size_data, byteorder='big')
            # Receive the actual message
            data = conn.recv(message_size)
            if not data:
                break
            # Print the received data
            print("Received:", data.decode())




#not work
"""
from socket import *
try:
    s=socket(AF_INET, SOCK_STREAM)
    host="127.0.0.1"
    port=7001
    s.bind((host,port))
    s.listen(5)
    client, addr=s.accept()
    print("connection from", addr[0])
    while True:
        x=client.recv(1024)
        length= str (x.decode('utf-8'))
        print(length)
        z = int (length,16)
        print(z)
        x=client.recv(z)
        print("client : ",x.decode('utf-8'))
        y=input(" server : ")
        client.send(y.encode('utf-8'))
    s.close()
except error as e:
    print(e)
except KeyboardInterrupt :
    print("chat is terminated")
"""