
use std::net::{TcpListener, TcpStream};
use std::thread;
use std::time;
use std::io::{self, Read, Write};


fn handle_client(stream: TcpStream) -> io::Result<()> {

    Ok(())
}


fn main() -> std::io::Result<()> {

    let listener = TcpListener::bind("127.0.0.1:8080")?;

    // accept connections and process them serially
    for stream in listener.incoming() {
        handle_client(stream?);
    }
    Ok(())
}
