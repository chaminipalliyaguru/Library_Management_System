-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 02, 2025 at 08:52 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `user_name`, `password`) VALUES
(14, 'nadeeshmalaka36@gmail.com', '1234'),
(16, 'admin@gmail.com', 'Nadeesh12'),
(17, 'nadeeshmalaka3@gmail.com', '1234'),
(18, 'admin12@gmail.com', '11111'),
(19, 'ict21010', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `book_id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `description` text DEFAULT NULL,
  `category` varchar(100) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `bookstatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`book_id`, `title`, `author`, `description`, `category`, `qty`, `bookstatus`) VALUES
(1, 'The Great Gatsby', 'F. Scott Fitzgerald', 'A novel set in the Jazz Age that tells the story of Jay Gatsby and his unrequited love for Daisy Buchanan.', 'fiction', 15, 'Available'),
(2, '1984', 'George Orwell', 'A dystopian novel that explores the dangers of totalitarianism and extreme political ideology.', 'Dystopian', 5, 'Available'),
(3, 'To Kill a Mockingbird', 'Harper Lee', 'A novel about the serious issues of rape and racial inequality narrated by a young girl.', 'Fiction', 8, 'Not-Available'),
(4, 'Pride and Prejudice', 'Jane Austen', 'A romantic novel that critiques the British landed gentry at the end of the 18th century.', 'Romance', 12, 'Available'),
(5, 'Moby Dick', 'Herman Melville', 'The narrative of Captain Ahab’s obsessive quest to seek revenge on Moby Dick, a giant white whale.', 'Adventure', 3, 'Available'),
(6, 'The Catcher in the Rye', 'J.D. Salinger', 'A story about teenage angst and alienation narrated by Holden Caulfield.', 'Fiction', 7, 'Pending'),
(7, 'Brave New World', 'Aldous Huxley', 'A dystopian novel that anticipates developments in reproductive technology and sleep-learning.', 'fiction', 4, 'Not-Available');

-- --------------------------------------------------------

--
-- Table structure for table `settings`
--

CREATE TABLE `settings` (
  `id` int(11) NOT NULL,
  `library_name` varchar(255) NOT NULL,
  `contact_number` varchar(20) NOT NULL,
  `library_email` varchar(255) NOT NULL,
  `max_books` int(11) NOT NULL,
  `fine_rate` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `settings`
--

INSERT INTO `settings` (`id`, `library_name`, `contact_number`, `library_email`, `max_books`, `fine_rate`) VALUES
(1, 'Central Library', '+94 71 123 4567', 'central.library@gmail.com', 5, 1);

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `transaction_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `book_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `transaction_date` date NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`transaction_id`, `user_id`, `book_id`, `quantity`, `transaction_date`, `status`) VALUES
(1, 1001, 5001, 1, '2025-02-01', 'Borrow'),
(2, 1002, 5002, 2, '2025-02-01', 'Borrow'),
(3, 1003, 5003, 1, '2025-01-28', 'Return'),
(4, 1004, 5004, 1, '2025-01-25', 'Borrow'),
(5, 1005, 5005, 3, '2025-01-20', 'Borrow'),
(6, 1006, 5006, 1, '2025-01-15', 'Return'),
(7, 1007, 5007, 2, '2025-02-01', 'Borrow'),
(8, 1008, 5008, 1, '2025-01-30', 'Borrow'),
(9, 1009, 5009, 1, '2025-01-28', 'Return'),
(10, 1010, 5010, 2, '2025-02-02', 'Borrow'),
(11, 1, 2, 5, '2025-02-11', 'Borrow');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `u_id` int(11) NOT NULL,
  `f_name` varchar(255) DEFAULT NULL,
  `l_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`u_id`, `f_name`, `l_name`, `email`, `mobile_no`, `address`) VALUES
(1, 'Nadeesh', 'Chathuranga', 'test@gmail.com', '0774902773', 'No:46/3,Kodurawa,Polgasowita'),
(2, 'test_user', 'kavidu 2', 'test2@gmail.com', '0788902774', 'Polgasowita '),
(5, 'Malaka', 'Chathuranga', 'malaka@gmail.com', '0774683556', 'Polgasowita');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `settings`
--
ALTER TABLE `settings`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`transaction_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `settings`
--
ALTER TABLE `settings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `transaction_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
