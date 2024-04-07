

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




