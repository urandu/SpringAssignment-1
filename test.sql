-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 11, 2015 at 09:04 AM
-- Server version: 5.5.43-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `drug_details`
--

CREATE TABLE IF NOT EXISTS `drug_details` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `Patient_Id` int(8) NOT NULL,
  `drug_name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Patient_Id` (`Patient_Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `drug_details`
--

INSERT INTO `drug_details` (`id`, `Patient_Id`, `drug_name`) VALUES
(1, 7, 'panadol'),
(2, 7, 'panadol'),
(3, 7, 'panadol'),
(4, 7, 'hedex'),
(5, 7, 'chilax'),
(6, 7, 'nyu'),
(7, 8, 'panadol'),
(8, 8, 'action');

-- --------------------------------------------------------

--
-- Table structure for table `patient_details`
--

CREATE TABLE IF NOT EXISTS `patient_details` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `dob` date NOT NULL,
  `time_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `patient_details`
--

INSERT INTO `patient_details` (`id`, `first_name`, `last_name`, `dob`, `time_created`) VALUES
(7, 'bildad', 'namawa', '2015-12-05', '2015-05-08 12:48:43'),
(8, 'willis', 'omwomo', '0199-12-05', '2015-05-08 13:52:29');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `drug_details`
--
ALTER TABLE `drug_details`
  ADD CONSTRAINT `drug_details_ibfk_1` FOREIGN KEY (`Patient_Id`) REFERENCES `patient_details` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
