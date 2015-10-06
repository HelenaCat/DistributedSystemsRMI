# DistributedSystemsRMI

Stappenplan om te runnen: 

Zorg dat de 2 extra files ook in de src-folder staan!

1. Compileren in de src-folder: javac -d /home/faes/git/DistributedSystemsRMI/RMI/src client/AbstractTesting.java client/AbstractTestBooking.java client/Client.java client/ReservationConstraints.java rental/Car.java rental/CarRentalCompany.java rental/CarType.java rental/ICarRentalCompany.java rental/Quote.java rental/RentalServer.java rental/Reservation.java rental/ReservationException.java
2. Start rmiregistry in de src-folder ("rmiregistry &")
3. Start de server in de src-folder: java -classpath /home/faes/git/DistributedSystemsRMI/RMI/src -Djava.rmi.server.codebase=file:/home/faes/git/DistributedSystemsRMI/RMI/src/ rental.RentalServer
4. Juich
5. Start de client in de src-folder, in een andere terminal: java  -classpath /home/faes/git/DistributedSystemsRMI/RMI/src client.Client

Vergeet de rmiregistry achteraf niet te killen ("killall rmiregistry")!
