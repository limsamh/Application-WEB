-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 03 Avril 2016 à 01:25
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `chatbd`
--

-- --------------------------------------------------------

--
-- Structure de la table `astuces`
--

CREATE TABLE IF NOT EXISTS `astuces` (
  `id_astuces` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(20) NOT NULL,
  `nom_chat` varchar(30) NOT NULL,
  `contenu` varchar(100) NOT NULL,
  PRIMARY KEY (`id_astuces`),
  KEY `fk_login` (`login`),
  KEY `fk_chat` (`nom_chat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `chat`
--

CREATE TABLE IF NOT EXISTS `chat` (
  `nom_chat` varchar(30) NOT NULL,
  `nom_japonais` varchar(30) CHARACTER SET utf8 NOT NULL,
  `description` varchar(100) NOT NULL,
  `caractere` varchar(40) NOT NULL,
  `niveau` int(11) NOT NULL,
  `image` varchar(40) NOT NULL,
  `type_chat` int(11) NOT NULL,
  `login` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`nom_chat`),
  KEY `fk_login1` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `chat`
--

INSERT INTO `chat` (`nom_chat`, `nom_japonais`, `description`, `caractere`, `niveau`, `image`, `type_chat`, `login`) VALUES
('Billy the Kitten', 'きっどさん', 'Western Wear', 'Nihilistic', 250, 'images/16.png', 0, NULL),
('Bob the Cat', 'やまねこさん', 'Adventurer', 'Outdoorsy', 40, 'images/7.png', 0, NULL),
('Chairman Meow', 'なべねこさん', 'Camouflage', 'Boorish', 111, 'images/4.png', 0, NULL),
('Conductor Whiskers', 'えきちょうさん', 'Railway Uniform', 'Vigilant', 50, 'images/8.png', 0, NULL),
('Frosty', 'ゆきねこさん', 'Straw Coat', 'Sensitive', 5, 'images/17.png', 0, NULL),
('Guy Furry', 'びすとろさん', 'Apron', 'Artisan', 30, 'images/12.png', 0, NULL),
('Joe DiMeowgio', 'たてじまさん', 'Baseball Jersey', 'Team Player', 28, 'images/1.png', 0, NULL),
('Kathmandu', 'まろまゆさん ', 'Hunting Coat', 'Refined', 150, 'images/13.png', 0, NULL),
('Lady Meow-Meow', 'あめしょさん', 'American Shorthair', 'Diva', 100, 'images/11.png', 0, NULL),
('Mr.Meowgi', 'おさむらいさん', 'Ronin', 'Mentoring', 250, 'images/10.png', 0, NULL),
('Ms. Fortune', 'こいこいさん', 'Gold', 'Charismatic', 20, 'images/6.png', 0, NULL),
('Ramses the Great', 'すふぃんさん', 'Sphinx', 'Riddler', 230, 'images/14.png', 0, NULL),
('Saint Purrtrick', 'ねこまたさん', 'Ethereal', 'Awe-Inspiring', 222, 'images/5.png', 0, NULL),
('Sassy Fran', 'かふぇさん', 'Waitress', 'Enthusiastic', 180, 'images/15.png', 0, NULL),
('Senor Don Gato', 'ながぐつさん', 'Mustachioed', 'Scheming', 30, 'images/2.png', 0, NULL),
('Tubbs', 'まんぞくさん', 'Fluffy', 'Finicky Feaster', 130, 'images/9.png', 0, NULL),
('Xerxes IX', 'ぷりんすさん', 'Persian', 'Regal', 70, 'images/3.png', 0, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE IF NOT EXISTS `compte` (
  `login` varchar(20) NOT NULL,
  `motdepasse` varchar(30) NOT NULL,
  `idutilisateur` int(11) NOT NULL DEFAULT '2',
  `email` varchar(40) NOT NULL,
  PRIMARY KEY (`login`),
  KEY `fk_compte` (`idutilisateur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `compte`
--

INSERT INTO `compte` (`login`, `motdepasse`, `idutilisateur`, `email`) VALUES
('toast', 'toast', 2, 'toast@toast.fr'),
('toto', 'toto', 2, '');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `idutilisateur` int(11) NOT NULL AUTO_INCREMENT,
  `droit` varchar(30) NOT NULL,
  PRIMARY KEY (`idutilisateur`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`idutilisateur`, `droit`) VALUES
(1, 'admin'),
(2, 'user');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `astuces`
--
ALTER TABLE `astuces`
  ADD CONSTRAINT `fk_chat` FOREIGN KEY (`nom_chat`) REFERENCES `chat` (`nom_chat`),
  ADD CONSTRAINT `fk_login` FOREIGN KEY (`login`) REFERENCES `compte` (`login`);

--
-- Contraintes pour la table `chat`
--
ALTER TABLE `chat`
  ADD CONSTRAINT `fk_login1` FOREIGN KEY (`login`) REFERENCES `compte` (`login`);

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `fk_compte` FOREIGN KEY (`idutilisateur`) REFERENCES `utilisateur` (`idutilisateur`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
