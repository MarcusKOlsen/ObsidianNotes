---
updated_at: 2026-09-10T09:57:59.746+02:00
edited_seconds: 1420
---
## Architecture Types
### Client-Server
- Examples
	- HTTP, IMAP, FTP
- Server
	- Always on-host
	- Permanent IP address
	- Used for scalability
- Client
	- Not connected at all times
	- Dynamic IP address
	- Do not communicate directly with other clients. Everything routed through server
### Peer-to-peer
- P2P file sharing (torrent)
- Server
	- None
- Client
	- Connect with other clients
		- Provides services to each other
	- Self scaling
	- Not always connected
	- Dynamic IP address

## Process
- Essentially a thread
- Multiple running on a host
- Use inter-process communication through the OS
- Processes between different hosts communicate exchanging messages
- For Client-Server
	- Host process contacts server
- For P2P
	- Host processes contact eachother
### Sockets
- Processes send/recieve messages from sockets
- One sending socket, one receiving
### Addressing (identifying)
- Host device has unique 32-bit IP address (not enough)
- Host has IP and port (port points to a specific process)
	- Example:
		- HTTP server process on port 80
		- Mail server process on port 25
		- On same host

## Protocols
- An application layer protocol defines
	- **Types of messages** 
		- request, response
	- **message syntax** 
		- format of info
	- **Message semantics**
		- meaning of info
	- **Rules** 
		- what to do
	- **Open protocols** 
		- delivered in RFCs, everyone has access to these
		- uniform
		- Interoperability
	- **Proprietary protocols** (Skype, Zoom)
- What do the protocols need to provide
	- **Data integrity** 
		- whole file arrives (depending on neccesity)
	- **Timing**
		- data arrives exactly on time (depending on neccesity)
	- **Throughput**
		- Speed, power, whatever
	- **Security**
		- duh

### HTTP 1.0 (Non-Persistent)
- [[Network Applications#Client-Server|Client-Server]] architetcure based
	- Client: Browser
	- Server: Website
- Uses [[Network Applications#TCP (Transmission Control Protocol)|TCP]]
	- Client initiates connection (port 80 default, I think)
	- Client exchanges HTTP messages to Server
- Stateless (Non-Persistent)
	- Server remembers no information about past clients
	- Uses stateless because way less complex
		- Stateful not 'thread-safe' (synchronised)
			- Kinda, because lost packets n stuff like that
		- Kinda slow

### HTTP 1.1 (Persistent)
- Server leaves connection open after disconnection
	- Saves time, more complex

### HTTP Requests
- Request/Response
	- GET
		- Get something
	- POST
		- Send something
	- HEAD
		- Get headers of request
	- PUT
		- Upload files
- ASCII based
	- Human readable
- Format
	- request line
		- Command (GET;POST;HEAD)
	- header lines
		- Host
			- Address for server
		- User-Agent
			- What browser
		- Accept
			- What filetype
		- Accept-language
			- What language
		- Accept-encoding
			- Compressed / not
		- Connection
			- Keep alive / not
		- Carriage return
			- \r\n
				- Signifies end of request
	- body
		- Pure data

### HTTP Responses
- Status code
	- 200 - OK
	- 404 - yknow
- Header lines
	- All the header info
- Body
	- Data
## Transport Layer Protocols
### TCP (Transmission Control Protocol)
- Reliable
- Flow control
- Congestion control
- Connection-oriented

- Does not provide
	- Timing
	- Quality of Service
	- Security
### UDP (User Datagram Protocol)
- Unreliable transport, but transport
- Simple, does not require connection
- Does not provide
	- Anything else