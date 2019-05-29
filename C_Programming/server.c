#include <netdb.h> 
#include <netinet/in.h> 
#include <stdlib.h> 
#include <string.h> 
#include <sys/socket.h> 
#include <sys/types.h>
#include <stdio.h> 
#include <unistd.h>
#include <sys/stat.h> 
#include <fcntl.h>
#define MAX 80 
#define PORT 8080 
#define SA struct sockaddr 

struct torrent {
    char name[50];
    char info[80];
    int size;
} listOfTorrents;

void writeToFile(char* filename, char* clientReques, char* address, int size);
void readFromFile(char* filename, char* reading);
 
void receiveFromClient(int sockfd)
{ 
	char clientReques[MAX]; 
	int sizeOfTorrent;
	char reading[MAX];
	char sendToClient[MAX];
	
	char filePattern[80] = ".txt";
	char nameOfTorrent[50];
	struct torrent listOfTorrents[10];
	int i;
	printf("List of torrents:\n");
	strcpy(listOfTorrents[0].name, "GTA");
	strcpy(listOfTorrents[1].name, "MortalCombat");
	strcpy(listOfTorrents[2].name, "UFC");
	strcpy(listOfTorrents[3].name, "FIFA");
	strcpy(listOfTorrents[4].name, "SuperMario");
	strcpy(listOfTorrents[5].name, "AngryBirds");
	strcpy(listOfTorrents[6].name, "NFS");
	strcpy(listOfTorrents[7].name, "LordOfTheRings");
	strcpy(listOfTorrents[8].name, "HrPotter");
	strcpy(listOfTorrents[9].name, "GoT");

	for(i = 0; i < 10; i++){
	printf("%s\n", listOfTorrents[i].name);
	}


	bzero(reading, MAX);
	/*for (;;) {
		bzero(clientReques, MAX);
		bzero(sendToClient, MAX);
		char address[MAX] = "/home/levon/Desktop/SPr/";	

		while ((buff[n++] = getchar()) != '\n') 
					; 

		// and send that buffer to client 
		write(sockfd, sendToClient, sizeof(sendToClient)); 
 
		read(sockfd, (char*)clientReques, sizeof(clientReques)); 
		strcat(address, clientReques);
		sizeOfTorrent = strlen(clientReques);

		if(strcmp(clientReques, reading) == 0 ){
			printf("Already made that request\n");
		}

		printf("From client:%s\n",clientReques);
		printf("STRCMP:%d\n",strcmp(clientReques, reading));
		
		if(strcmp(clientReques, reading) != 0) {
			writeToFile("kursova.txt", clientReques, address, sizeOfTorrent);
		}

		readFromFile("kursova.txt", reading);*/

		char buff[MAX]; 
		int n; 
		for (;;) { 
			bzero(buff, MAX); 

			read(sockfd, buff, sizeof(buff)); 
			printf("From client: %s\t To client : ", buff); 
			bzero(buff, MAX); 
			n = 0; 
			while ((buff[n++] = getchar()) != '\n') 
				    ; 

			write(sockfd, buff, sizeof(buff)); 
 
		} 
	} 
} 

void writeToFile(char* filename, char* clientReques, char* address, int size){
	int rd;
	rd = open(filename, O_WRONLY | O_APPEND | O_CREAT);
		if(rd < 0) {
			printf("Error with opening in writing\n");
		}
		write(rd, clientReques, strlen(clientReques));
		write(rd, address, strlen(address));
		write(rd, &size, sizeof(size));
	close(rd);
}

void readFromFile(char* filename, char* reading) {
	int fd;
	int sr;	
	fd = open(filename, O_RDONLY);
	if(fd < 0) {
		printf("Error with opening in reading\n");
	}
	sr = read(fd, (char*)&reading, strlen(reading));
	if(sr < 0){
	printf("Error with reading the file");
	}
	
	printf("Reading from file: %s\n",reading);
		
}


int main() 
{ 
	int sockfd, connfd, len; 
	struct sockaddr_in servaddr, cli;
	
	sockfd = socket(AF_INET, SOCK_STREAM, 0); 
	if (sockfd == -1) { 
		printf("socket creation failed...\n"); 
		exit(0); 
	} 
	else
		printf("Socket successfully created..\n"); 
	bzero(&servaddr, sizeof(servaddr)); 

	servaddr.sin_family = AF_INET; 
	servaddr.sin_addr.s_addr = htonl(INADDR_ANY); 
	servaddr.sin_port = htons(PORT); 
 
	if ((bind(sockfd, (SA*)&servaddr, sizeof(servaddr))) != 0) { 
		printf("socket bind failed...\n"); 
		exit(0); 
	} 
	else
		printf("Socket successfully binded..\n"); 

	if ((listen(sockfd, 5)) != 0) { 
		printf("Listen failed...\n"); 
		exit(0); 
	} 
	else
		printf("Server listening..\n"); 
	len = sizeof(cli); 
 
	connfd = accept(sockfd, (SA*)&cli, &len); 
	if (connfd < 0) { 
		printf("server acccept failed...\n"); 
		exit(0); 
	} 
	else
		printf("server acccept the client...\n"); 

	receiveFromClient(connfd); 
	close(sockfd); 
} 

