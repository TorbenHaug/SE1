-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 25. Nov 2014 um 07:07
-- Server Version: 5.5.32
-- PHP-Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Datenbank: `sole`
--
CREATE DATABASE IF NOT EXISTS `sole` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `sole`;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `abgegebene_antworten`
--

CREATE TABLE IF NOT EXISTS `abgegebene_antworten` (
  `lernkarten_id` varchar(36) NOT NULL,
  `student_matr` int(11) NOT NULL,
  `antwort_data` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `abgegebene_antworten`
--

INSERT INTO `abgegebene_antworten` (`lernkarten_id`, `student_matr`, `antwort_data`) VALUES
('02c3f007-da15-4834-acab-64a93064f8ac', 2170310, 'This is a test+'),
('6d7ccb1e-75c0-4918-9569-99fbe6ea5251', 2170310, 'Nein+'),
('74200c06-18ae-469f-92c9-3d08714cb95d', 2170310, 'Das ist richtig+'),
('7ecdbffd-cc31-4dd0-b033-37c1a5af7b0f', 2170310, 'This is a test'),
('c76d3d25-46af-4c14-b923-f810d78fde13', 2170310, 'Nein'),
('29e7e6ed-bf25-4810-8d15-d31d60921e5e', 2170310, 'Das ist richtig'),
('420d6d3f-bfb0-4e70-9cd7-0b2a907436b4', 2170310, 'This is a test'),
('2bbbdcfc-5c06-47c7-ba8c-9fdedd5adddd', 2170310, 'Nein'),
('a9bc65c8-fd25-423f-8182-90c100f1f594', 2170310, 'Das ist richtig'),
('e5e66600-ea10-4a51-b1f9-508b93348450', 2170310, 'This is a test'),
('ddedbf0e-63ad-4e71-9cb5-9585e6b65b6f', 2170310, 'Nein'),
('ca78e1cc-9676-406c-aad6-881a5da43b01', 2170310, 'Das ist richtig'),
('cf6b523d-5a96-40f8-9ef7-2b0f02826785', 2170310, 'Läuft beim Huhn'),
('6dcf47b0-350e-4ebd-b26a-19b9a2b73d8a', 2170310, 'Weil ich es kann');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `lernkarten`
--

CREATE TABLE IF NOT EXISTS `lernkarten` (
  `id` int(11) NOT NULL,
  `frage` text NOT NULL,
  `fach` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `data` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `lernkarten`
--

INSERT INTO `lernkarten` (`id`, `frage`, `fach`, `type`, `data`) VALUES
(1, 'TEST', 'Software Engineering', 'SingleChoice', 'This is a test+;This is another test'),
(2, 'Hallo Hallo', 'Software Engineering', 'SingleChoice', 'Nein;Doch+;NEIN'),
(3, 'Beep beep', 'Software Engineering', 'SingleChoice', 'Das ist richtig+; Das ist falsch'),
(4, 'Was kommt PI am nächsten?', 'Mathenatik', 'SingleChoice', '1;2;3+;4'),
(5, 'Warum ging das Huhn über die Straße?', 'Software Engineering', 'SingleChoice', 'Läuft beim Huhn+;Weil da was geht;Weil Baum;Weil es dumm ist'),
(6, 'Warum machen wir alles so kompliziert?', 'Software Engineering', 'SingleChoice', 'Weil ich es kann;Weil es cool ist;Damit mein nächester es nicht warten kann und die Firma mich nicht feuert+'),
(7, 'Warum?', 'Betriebswirtschafstlehre', 'SingleChoice', '42+;Darum;Warum?;Hans');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
