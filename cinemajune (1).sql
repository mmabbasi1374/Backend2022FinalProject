-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 29, 2022 at 01:04 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cinemajune`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `addNewAppointment` (IN `movie-idIN` INT, IN `room-idIN` INT, IN `timeIN` DATE, IN `priceIN` INT)   INSERT INTO `appointment` (`appointment`.`movie-id`, `appointment`.`room-id`, `appointment`.`time`, `appoinment`.`price`) VALUES (movieId, roomId, NOW(), price)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `addNewMovie` (IN `titleIN` VARCHAR(50) CHARSET utf8mb4, IN `lengthIN` INT(50), IN `ageIN` INT(20), IN `directoreIN` VARCHAR(50) CHARSET utf8mb4)   INSERT into `movie` (`movie`.`title`, `movie`.`length`, `movie`.`age-limit`, `movie`.`director`) VALUES (titleIN, lengthIN, ageIN, directorIN)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `addNewUser` (IN `email` VARCHAR(50) CHARSET utf8mb4, IN `firstName` VARCHAR(50) CHARSET utf8mb4, IN `lastName` VARCHAR(50) CHARSET utf8mb4, IN `password` TEXT, IN `phone` INT(20))   INSERT INTO `user` (`user`.`email`, `user`.`firstName`, `user`.`lastName`, `user`.`password`, `user`.`phone`) VALUES (email, firstName, lastName, Password, Phone)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllAppoinment` ()   SELECT * FROM `appointment`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getPurchased` ()   SELECT*FROM`purchased`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getRoom` ()   SELECT*FROM `room`$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `id` int(20) NOT NULL,
  `movie-id` int(20) NOT NULL,
  `room-id` int(20) NOT NULL,
  `time` datetime(6) NOT NULL,
  `price` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE `movie` (
  `id` int(20) NOT NULL,
  `title` varchar(50) NOT NULL,
  `length` int(20) NOT NULL,
  `age-limit` int(20) NOT NULL,
  `director` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `purchased`
--

CREATE TABLE `purchased` (
  `id` int(20) NOT NULL,
  `user-id` int(20) NOT NULL,
  `appointment-id` int(20) NOT NULL,
  `amount` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `id` int(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `size` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `password` text NOT NULL,
  `phone` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `purchased`
--
ALTER TABLE `purchased`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `movie`
--
ALTER TABLE `movie`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `purchased`
--
ALTER TABLE `purchased`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
