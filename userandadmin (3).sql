-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2024 at 04:57 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `userandadmin`
--

-- --------------------------------------------------------

--
-- Table structure for table `parking`
--

CREATE TABLE `parking` (
  `ID` int(50) NOT NULL,
  `TicketNo` int(50) NOT NULL,
  `Companyname` varchar(255) NOT NULL,
  `Brand` varchar(255) NOT NULL,
  `PlateNo` varchar(255) NOT NULL,
  `TimeIn` varchar(255) NOT NULL,
  `TimeOut` varchar(11) NOT NULL,
  `Color` varchar(255) NOT NULL,
  `VehicleType` varchar(255) NOT NULL,
  `Date` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `parking`
--

INSERT INTO `parking` (`ID`, `TicketNo`, `Companyname`, `Brand`, `PlateNo`, `TimeIn`, `TimeOut`, `Color`, `VehicleType`, `Date`) VALUES
(8, 213, 'Mass-Market Cars', 'Ford', 'ER33', '10:14', '12:00', 'Blue', 'Car', '2024-05-08'),
(9, 214, 'Mass-Market Cars', 'Honda', 'DF44', '10:15', '6:00', 'Silver', 'Car', '2024-05-09'),
(10, 215, 'Mass-Market Cars', 'BMW', 'ZX55', '10:19', '1:00', 'White/Blue', 'Car', '2024-05-10'),
(11, 217, 'Mass-Market Cars', 'Rusi', 'SF77', '10:46', '9:00', 'Gray', 'Truck', '2024-05-11'),
(12, 215, 'Mass-Market Cars', 'BMW', 'FG66', '10:32', '7:00', 'White', 'Motorcycle', '2024-05-12'),
(13, 219, 'Mass-Market Cars', 'BMW', 'MP88', '10:50', '10:00', 'Mhite', 'Sikad', '2024-05-13'),
(14, 215, 'Mass-Market Cars', 'BMW', 'PP99', '10:47', '2:33', 'Mlack', 'Car', '2024-05-14'),
(15, 216, 'Mass-Market Cars', 'Tesla', 'MM21', '5:57', '8:59', 'MLAck', 'Truck', '2024-05-26'),
(16, 217, 'Mass-Market Cars', 'Tesla', 'NN22', '5:57', '7:00', 'Brown', 'Truck', '2024-05-16'),
(17, 218, 'Mass-Market Cars', 'sinaw', 'LL23', '6:15', '8:16', 'Mlown', 'Truck', '2024-05-17'),
(18, 219, 'OPPA', 'HOP', 'OO24', '9:23', '8:14', 'Blue', 'Car', '2024-05-26'),
(19, 220, 'Mass-Market Cars', 'Kulafo', 'ZZ44', '12:48', '1:00', 'Black', 'Car', '2024-05-29'),
(20, 221, 'Mass-Market Cars', 'Lubi', 'KZ45', '10:03', '12:00', 'blue', 'Motorcycle', '2024-06-04');

-- --------------------------------------------------------

--
-- Table structure for table `tickettimer`
--

CREATE TABLE `tickettimer` (
  `ID` int(10) NOT NULL,
  `TicketNo` varchar(255) NOT NULL,
  `TimeIn` varchar(6) NOT NULL,
  `TimeOut` varchar(6) NOT NULL,
  `Fee` decimal(10,0) NOT NULL,
  `Status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tickettimer`
--

INSERT INTO `tickettimer` (`ID`, `TicketNo`, `TimeIn`, `TimeOut`, `Fee`, `Status`) VALUES
(7, '218', '6:15', '8:16', 0, 'Unpaid'),
(8, '219', '10:50', '10:00', 116, 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `ttb`
--

CREATE TABLE `ttb` (
  `u_id` int(11) NOT NULL,
  `u_Email` varchar(50) NOT NULL,
  `u_Fname` varchar(50) NOT NULL,
  `u_Lname` varchar(50) NOT NULL,
  `u_Username` varchar(50) NOT NULL,
  `u_Password` varchar(255) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `u_image` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ttb`
--

INSERT INTO `ttb` (`u_id`, `u_Email`, `u_Fname`, `u_Lname`, `u_Username`, `u_Password`, `u_type`, `u_status`, `u_image`) VALUES
(1001, 'Steven@gmail.com', 'Steven', 'Pable', 'PandeCoco', '1MppcGrfX6jE1PgM3m9zB6+dwmnRQR7x97+RCbYydic=', 'Admin', 'Active', ''),
(1002, 'Pable@gmail.com', 'Pable', 'Steven', 'Pan', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Active', ''),
(1003, 'Guko@gmail.com', 'Guko', 'Buko', 'kakarot', 'kBkJ5kh824IHJtRXivuB8GbRdeYY61mrpd3a20WFmXc=', 'User', 'Pending', ''),
(1005, 'LOGO', 'Logos', 'logo', 'logoo', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', 'src/userimages/loho1.png'),
(1006, 'Holly@gmail.com', 'Molly', 'Moll', 'Modes', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', 'default_image_path.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `parking`
--
ALTER TABLE `parking`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tickettimer`
--
ALTER TABLE `tickettimer`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `ttb`
--
ALTER TABLE `ttb`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `parking`
--
ALTER TABLE `parking`
  MODIFY `ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `tickettimer`
--
ALTER TABLE `tickettimer`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `ttb`
--
ALTER TABLE `ttb`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1007;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
