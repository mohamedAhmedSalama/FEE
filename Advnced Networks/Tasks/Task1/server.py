

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




