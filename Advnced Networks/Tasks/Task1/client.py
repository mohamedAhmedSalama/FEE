"""
# -*- coding: utf-8 -*-

@author: ChatRoom ==> Client


import socket
import threading

# Choosing Nickname
nickname = input("Choose your nickname: ")

# Connecting To Server
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(('127.0.0.1', 7012))

# Listening to Server and Sending Nickname
def receive():
    while True:
        try:
            # Receive Message From Server
            # If 'NICK' Send Nickname
            message = client.recv(1024).decode('ascii')
            if message == 'NICK':
                client.send(nickname.encode('ascii'))
            else:
                print(message)
        except:
            # Close Connection When Error
            print("An error occured!")
            client.close()
            break
        
# Sending Messages To Server
def write():
    while True:
        message = '{}: {}'.format(nickname, input(''))
        print(message)
        client.send(message.encode('ascii'))
        
# Starting Threads For Listening And Writing
receive_thread = threading.Thread(target=receive)
receive_thread.start()

write_thread = threading.Thread(target=write)
write_thread.start()


"""











#work1

import socket

# Define host and port
HOST = '127.0.0.1'  # The server's hostname or IP address
PORT = 65432        # The port used by the server

# Create a socket object
with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    # Connect to the server
    s.connect((HOST, PORT))
    while True:
        # Get user input
        message = input("Enter message to send (type 'exit' to quit): ")
        if message.lower() == 'exit':
            break
        # Get the size of the message
        message_size = len(message)
        # Send the size of the message to the server as a 4-byte integer
        s.sendall(message_size.to_bytes(4, byteorder='big'))
        # Send the message to the server
        s.sendall(message.encode())




#not work

"""
from socket import *
try:
    s=socket(AF_INET, SOCK_STREAM)
    host="127.0.0.1"
    port=7001
    s.connect((host,port))
    while True:
        y=input("client : ")
        length= str (len(y))
        print(length)
        s.send(length.encode('utf-8'))
        s.send(y.encode('utf-8'))
        x=s.recv(2)
        print("server : ",x.decode('utf-8'))
    s.close()
except error as e:
    print(e)
except KeyboardInterrupt :
    print("chat is terminated")
"""