CREATE TABLE `item` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `category` varchar(20) ,
  `description` varchar(15),
  `name` varchar(100) NOT NULL,
  `price` double(16) ,
  PRIMARY KEY (`Id`)
);