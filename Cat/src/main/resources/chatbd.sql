-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 03 Avril 2016 à 14:02
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
  `couleur` varchar(30) NOT NULL,
  PRIMARY KEY (`nom_chat`),
  KEY `fk_login1` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `chat`
--

INSERT INTO `chat` (`nom_chat`, `nom_japonais`, `description`, `caractere`, `niveau`, `image`, `type_chat`, `login`, `couleur`) VALUES
('Bandit', 'さびがらさん', 'Tortoiseshell', 'Wild at Heart', 180, 'images/Bandit.png', 0, NULL, ''),
('Billy the Kitten', 'きっどさん', 'Western Wear', 'Nihilistic', 250, 'images/Billy-O.png', 0, NULL, ''),
('Bob the Cat', 'やまねこさん', 'Adventurer', 'Outdoorsy', 40, 'images/Bob_the_Cat.png', 0, NULL, ''),
('Bolt', 'きじとらさん', 'Brown Tabby', 'Insatiable', 140, 'images/Bolt.png', 0, NULL, ''),
('Breezy', 'しろきじさん', 'Brown & White Tabby', 'Laid Back', 30, 'images/Breezy.png', 0, NULL, ''),
('Callie', 'みけさん', 'Calico', 'Carefree', 50, 'images/Callie.png', 0, NULL, ''),
('Chairman Meow', 'なべねこさん', 'Camouflage', 'Boorish', 111, 'images/Chair.png', 0, NULL, ''),
('Cocoa', 'ちゃはちさん', 'Brown Tuxedo', 'Indecisive', 45, 'images/Cocoa.png', 0, NULL, ''),
('Conductor Whiskers', 'えきちょうさん', 'Railway Uniform', 'Vigilant', 50, 'images/N-D.png', 0, NULL, ''),
('Dottie', 'しろみけさん', 'White Calico', 'Friendly', 195, 'images/Dottie.png', 0, NULL, ''),
('Fred', 'ちゃとらさん', 'Orange Tabby', 'Lady-Killer', 150, 'images/Fred.png', 0, NULL, ''),
('Frosty', 'ゆきねこさん', 'Straw Coat', 'Sensitive', 5, 'images/Frosty.png', 0, NULL, ''),
('Gabriel', 'はちわれさん', 'Tuxedo', 'Diligent', 150, 'images/Gabriel.png', 0, NULL, ''),
('Ginger', 'あかげさん', 'Red & White Mitts', 'Bashful', 60, 'images/Ginger.png', 0, NULL, ''),
('Gozer', 'とーびーさん', 'Tortoiseshell Tabby', 'Sore Loser', 155, 'images/N-D.png', 0, NULL, ''),
('Guy Furry', 'びすとろさん', 'Apron', 'Artisan', 30, 'images/Guy.png', 0, NULL, ''),
('Joe DiMeowgio', 'たてじまさん', 'Baseball Jersey', 'Team Player', 28, 'images/Joe_DiMeowgio.png', 0, NULL, ''),
('Kathmandu', 'まろまゆさん', 'Hunting Coat', 'Refined', 150, 'images/Kathmandu.png', 0, NULL, ''),
('Lady Meow-Meow', 'あめしょさん', 'American Shorthair', 'Diva', 100, 'images/Meow.png', 0, NULL, ''),
('Lexy', 'はいしろさん', 'Grey & White', 'Expensive Tastes', 100, 'images/Lexy.png', 0, NULL, ''),
('Mack', 'しろとらさん', 'White Mackerel', 'Determined', 130, 'images/Mack.png', 0, NULL, ''),
('Marshmallow', 'ぽいんとさん', 'Pointed', 'Aloof', 170, 'images/Marshmellow.png', 0, NULL, ''),
('Misty', 'さばとらさん', 'Mackerel Tabby', 'Lazy', 160, 'images/Misty.png', 0, NULL, ''),
('Mr.Meowgi', 'おさむらいさん', 'Ronin', 'Mentoring', 250, 'images/Meowgi.png', 0, NULL, ''),
('Ms. Fortune', 'こいこいさん', 'Gold', 'Charismatic', 20, 'images/Ms_Fortune.png', 0, NULL, ''),
('Patches', 'ぶちさん', 'Orange Patches', 'Jealous', 80, 'images/Patches.png', 0, NULL, ''),
('Peaches', 'くりーむさん', 'Tan & Orange', 'Capricious', 45, 'images/Peaches.png', 0, NULL, ''),
('Pepper', 'おっどさん', 'Black & Odd Eyes', 'Shy', 165, 'images/N-D.png', 0, NULL, ''),
('Pickles', 'しろさばさん', 'Gray & White Tabby', 'Faint-Hearted', 0, 'images/Pickles.png', 0, NULL, ''),
('Princess', 'むぎわらさん', 'Striped Torbie', 'Ditzy', 125, 'images/Princess.png', 0, NULL, ''),
('Pumpkin', 'しろちゃとらさん', 'Orange & White Tabby', 'Spacey', 90, 'images/Pumpkin.png', 0, NULL, ''),
('Ramses the Great', 'すふぃんさん', 'Sphinx', 'Riddler', 230, 'images/N-D.png', 0, NULL, ''),
('Rascal', 'はいはちさん', 'Grey Tuxedo', 'Selfish', 140, 'images/Rascal.png', 0, NULL, ''),
('Saint Purrtrick', 'ねこまたさん', 'Ethereal', 'Awe-Inspiring', 222, 'images/Saint.png', 0, NULL, ''),
('Sassy Fran', 'かふぇさん', 'Waitress', 'Enthusiastic', 180, 'images/Sassy_Fran.png', 0, NULL, ''),
('Senor Don Gato', 'ながぐつさん', 'Mustachioed', 'Scheming', 30, 'images/N-D.png', 0, NULL, ''),
('Shadow', 'はいいろさん', 'Solid Grey', 'Peculiar', 50, 'images/Shadow.png', 0, NULL, ''),
('Smokey', 'くろねこさん', 'Solid Black', 'Hot and Cold', 140, 'images/Smokey.png', 0, NULL, ''),
('Snowball', 'しろねこさん', 'Solid White', 'Mellow', 80, 'images/Snowball.png', 0, NULL, ''),
('Socks', 'くつしたさん', 'Black & White Mitts', 'Adventurous', 70, 'images/Socks.png', 0, NULL, ''),
('Speckles', 'くろぶちさん', 'Black Patches', 'Lonely', 40, 'images/Speckles.png', 0, NULL, ''),
('Spooky', 'はいさびさん', 'Grey Tortoiseshell', 'Reserved', 35, 'images/Spooky.png', 0, NULL, ''),
('Spots', 'しろくろさん', 'Black & White', 'Joker', 75, 'images/Spots.png', 0, NULL, ''),
('Spud', 'あかさびさん', 'Red Tortoiseshell', 'Cautious', 80, 'images/Spud.png', 0, NULL, ''),
('Sunny', 'とびみけさん', 'Turkish Calico', 'Mischievous', 120, 'images/Sunny.png', 0, NULL, ''),
('Tabitha', 'しまみけさん', 'Calico Tabby', 'Leisurely', 40, 'images/Tabitha.png', 0, NULL, ''),
('Tubbs', 'まんぞくさん', 'Fluffy', 'Finicky Feaster', 130, 'images/N-D.png', 0, NULL, ''),
('Willie', 'くろとらさん', 'Black Tabby', 'Crafty', 75, 'images/Willie.png', 0, NULL, ''),
('Xerxes IX', 'ぷりんすさん', 'Persian', 'Regal', 70, 'images/Xerxes.png', 0, NULL, '');

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
('admin', 'PGytuvRI/Jmicfl8uOgxqQ==', 2, ''),
('aimbarre', 'F35sxPg9zDzMzTzWjMVEww==', 2, 'toast@gmail.com'),
('toto', '5vEcAmWhfxiU+PnC+wdnkw==', 2, '');

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
