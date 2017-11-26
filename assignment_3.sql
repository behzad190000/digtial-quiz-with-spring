-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2017 at 06:01 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `assignment_3`
--

-- --------------------------------------------------------

--
-- Table structure for table `create_quiz`
--

CREATE TABLE `create_quiz` (
  `quiz_number` int(11) UNSIGNED NOT NULL,
  `title` varchar(20) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `allocated_time` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `create_quiz`
--

INSERT INTO `create_quiz` (`quiz_number`, `title`, `description`, `allocated_time`) VALUES
(12, 'Quiz 1', 'Math & physcis ', 150),
(13, 'Quiz 1', 'Math & physcis ', 150);

-- --------------------------------------------------------

--
-- Table structure for table `mcqs`
--

CREATE TABLE `mcqs` (
  `id` int(11) UNSIGNED NOT NULL,
  `mcqs_question` varchar(100) DEFAULT '',
  `option1` varchar(20) DEFAULT '',
  `option2` varchar(20) DEFAULT '',
  `option3` varchar(20) DEFAULT '',
  `option4` varchar(20) DEFAULT '',
  `mcqs_answer` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `numerical`
--

CREATE TABLE `numerical` (
  `id` int(11) UNSIGNED NOT NULL,
  `nm_question` varchar(100) DEFAULT '',
  `nm_answer` varchar(100) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id` int(11) UNSIGNED NOT NULL,
  `name` varchar(20) NOT NULL DEFAULT '',
  `country` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`id`, `name`, `country`) VALUES
(5, 'behzad', 'Pakistan'),
(6, 'behzad', 'Pakistan');

-- --------------------------------------------------------

--
-- Table structure for table `truefalse`
--

CREATE TABLE `truefalse` (
  `id` int(11) UNSIGNED NOT NULL,
  `tf_question` varchar(100) DEFAULT '',
  `tf_answer` varchar(100) DEFAULT '',
  `option1` varchar(20) DEFAULT '',
  `option2` varchar(20) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `create_quiz`
--
ALTER TABLE `create_quiz`
  ADD PRIMARY KEY (`quiz_number`);

--
-- Indexes for table `mcqs`
--
ALTER TABLE `mcqs`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `numerical`
--
ALTER TABLE `numerical`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `truefalse`
--
ALTER TABLE `truefalse`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `create_quiz`
--
ALTER TABLE `create_quiz`
  MODIFY `quiz_number` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `mcqs`
--
ALTER TABLE `mcqs`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `numerical`
--
ALTER TABLE `numerical`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `truefalse`
--
ALTER TABLE `truefalse`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
