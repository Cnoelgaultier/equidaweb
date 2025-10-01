-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3307
-- Généré le : mer. 01 oct. 2025 à 09:28
-- Version du serveur : 11.3.2-MariaDB
-- Version de PHP : 8.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `equida`
--

-- --------------------------------------------------------

--
-- Structure de la table `attacher`
--

DROP TABLE IF EXISTS `attacher`;
CREATE TABLE IF NOT EXISTS `attacher` (
  `idCourriel` int(11) NOT NULL,
  `idPieceJointe` int(11) NOT NULL,
  PRIMARY KEY (`idCourriel`,`idPieceJointe`),
  KEY `fk_attacher_piece` (`idPieceJointe`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `attacher`
--

INSERT INTO `attacher` (`idCourriel`, `idPieceJointe`) VALUES
(1, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Structure de la table `avoir`
--

DROP TABLE IF EXISTS `avoir`;
CREATE TABLE IF NOT EXISTS `avoir` (
  `id` int(11) NOT NULL,
  `id_1` int(11) NOT NULL,
  PRIMARY KEY (`id`,`id_1`),
  KEY `id_1` (`id_1`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `avoir`
--

INSERT INTO `avoir` (`id`, `id_1`) VALUES
(1, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Structure de la table `categvente`
--

DROP TABLE IF EXISTS `categvente`;
CREATE TABLE IF NOT EXISTS `categvente` (
  `id` int(11) NOT NULL,
  `libelle` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `categvente`
--

INSERT INTO `categvente` (`id`, `libelle`) VALUES
(1, 'Vente de Pur-sang'),
(2, 'Vente de Quarter Horse'),
(3, 'Vente de Frison');

-- --------------------------------------------------------

--
-- Structure de la table `cheval`
--

DROP TABLE IF EXISTS `cheval`;
CREATE TABLE IF NOT EXISTS `cheval` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(150) NOT NULL,
  `date_naissance` date NOT NULL,
  `race_id` int(11) DEFAULT NULL,
  `codeSire` varchar(50) NOT NULL,
  `taille` decimal(5,2) DEFAULT NULL,
  `poids` decimal(6,2) DEFAULT NULL,
  `typeRobe` varchar(50) DEFAULT NULL,
  `cheval_pere` int(11) DEFAULT NULL,
  `cheval_mere` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codeSire` (`codeSire`),
  KEY `fk_race` (`race_id`),
  KEY `fk_typeRobe` (`typeRobe`),
  KEY `fk_cheval_pere` (`cheval_pere`),
  KEY `fk_cheval_mere` (`cheval_mere`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `cheval`
--

INSERT INTO `cheval` (`id`, `nom`, `date_naissance`, `race_id`, `codeSire`, `taille`, `poids`, `typeRobe`, `cheval_pere`, `cheval_mere`) VALUES
(1, 'Eclipse', '2017-03-12', 4, 'SIRE001', NULL, NULL, NULL, 11, 12),
(2, 'Aztec', '2019-07-04', 4, 'SIRE002', NULL, NULL, NULL, 11, 12),
(3, 'orion', '2015-05-23', 5, 'SIRE003', NULL, NULL, NULL, 13, 14),
(4, 'Tempête de Feu', '2017-03-12', 1, 'SIRE004', NULL, NULL, NULL, 11, 13),
(5, 'Éclair Noir', '2019-07-04', 2, 'SIRE005', NULL, NULL, NULL, 10, 14),
(6, 'Vent du Nord', '2015-05-23', 3, 'SIRE006', NULL, NULL, NULL, 10, 13),
(7, 'Comète', '2018-01-01', 4, 'SIRE007', NULL, NULL, NULL, 10, 12),
(8, 'Silver Snow', '2020-11-17', 5, 'SIRE008', NULL, NULL, NULL, 1, 5),
(9, 'Caramel', '2016-06-30', 6, 'SIRE009', NULL, NULL, NULL, 13, 14),
(10, 'Storm', '2021-10-10', 1, 'SIRE010', NULL, NULL, NULL, NULL, NULL),
(11, 'Mustang', '2014-08-03', 2, 'SIRE011', NULL, NULL, NULL, NULL, NULL),
(12, 'Rising Sun', '2019-04-22', 3, 'SIRE012', NULL, NULL, NULL, NULL, NULL),
(13, 'Phantom', '2016-12-05', 4, 'SIRE013', NULL, NULL, NULL, NULL, NULL),
(14, 'Pompom', '2025-07-13', 2, 'SIRE014', NULL, NULL, NULL, NULL, NULL),
(15, 'Fleur du désert', '2023-06-30', 6, 'SIRE015', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id` int(11) NOT NULL,
  `titre_` varchar(50) DEFAULT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `prenom` varchar(50) DEFAULT NULL,
  `adrPartie1` varchar(50) DEFAULT NULL,
  `adrPartie2` varchar(50) DEFAULT NULL,
  `Cpos` varchar(50) DEFAULT NULL,
  `ville` varchar(50) DEFAULT NULL,
  `pays` varchar(50) DEFAULT NULL,
  `adresseMessagerie` varchar(50) DEFAULT NULL,
  `code` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `titre_`, `nom`, `prenom`, `adrPartie1`, `adrPartie2`, `Cpos`, `ville`, `pays`, `adresseMessagerie`, `code`) VALUES
(1, 'M.', 'Dupont', 'Jean', '12 rue des Lilas', '', '75012', 'Paris', 'France', 'jean.dupont@mail.com', 'FR'),
(2, 'Mme', 'Martin', 'Sophie', '45 avenue des Champs', '', '75008', 'Paris', 'France', 'sophie.martin@mail.com', 'FR'),
(3, 'M.', 'Schmidt', 'Karl', 'Bahnhofstr. 5', '', '10115', 'Berlin', 'Allemagne', 'karl.schmidt@mail.de', 'DE');

-- --------------------------------------------------------

--
-- Structure de la table `courriel`
--

DROP TABLE IF EXISTS `courriel`;
CREATE TABLE IF NOT EXISTS `courriel` (
  `id` int(11) NOT NULL,
  `date_` date DEFAULT NULL,
  `objet` varchar(50) DEFAULT NULL,
  `corps` varchar(50) DEFAULT NULL,
  `idVente` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_courriel_vente` (`idVente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `courriel`
--

INSERT INTO `courriel` (`id`, `date_`, `objet`, `corps`, `idVente`) VALUES
(1, '2025-09-01', 'Invitation Vente Printemps', 'Vous êtes invités à la vente de chevaux Pur-sang.', 1),
(2, '2025-06-30', 'Invitation Vente Été', 'Vous êtes invités à la vente de Quarter Horse.', 2);

-- --------------------------------------------------------

--
-- Structure de la table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `lieu` varchar(50) DEFAULT NULL,
  `date_` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `course`
--

INSERT INTO `course` (`id`, `nom`, `lieu`, `date_`) VALUES
(1, 'Grand Prix Vincennes', 'Vincennes', '2025-09-18'),
(2, 'Trophée Deauville', 'Deauville', '2025-07-12');

-- --------------------------------------------------------

--
-- Structure de la table `enchere`
--

DROP TABLE IF EXISTS `enchere`;
CREATE TABLE IF NOT EXISTS `enchere` (
  `numero` int(11) NOT NULL,
  `montant` varchar(50) DEFAULT NULL,
  `idClient` int(11) NOT NULL,
  `idLot` int(11) NOT NULL,
  PRIMARY KEY (`numero`),
  KEY `fk_enchere_client` (`idClient`),
  KEY `fk_enchere_lot` (`idLot`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `enchere`
--

INSERT INTO `enchere` (`numero`, `montant`, `idClient`, `idLot`) VALUES
(1, '5200', 1, 1),
(2, '4800', 2, 2),
(3, '7100', 3, 3),
(4, '6600', 1, 4);

-- --------------------------------------------------------

--
-- Structure de la table `interesser`
--

DROP TABLE IF EXISTS `interesser`;
CREATE TABLE IF NOT EXISTS `interesser` (
  `idClient` int(11) NOT NULL,
  `idCategVente` int(11) NOT NULL,
  PRIMARY KEY (`idClient`,`idCategVente`),
  KEY `fk_interesser_categ` (`idCategVente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `interesser`
--

INSERT INTO `interesser` (`idClient`, `idCategVente`) VALUES
(1, 1),
(2, 2),
(3, 3);

-- --------------------------------------------------------

--
-- Structure de la table `lieu_`
--

DROP TABLE IF EXISTS `lieu_`;
CREATE TABLE IF NOT EXISTS `lieu_` (
  `id` int(11) NOT NULL,
  `libelle` varchar(50) DEFAULT NULL,
  `nbBoxes` varchar(50) DEFAULT NULL,
  `commentaires` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `lieu_`
--

INSERT INTO `lieu_` (`id`, `libelle`, `nbBoxes`, `commentaires`) VALUES
(1, 'Vincennes', '50', 'Hippodrome de Vincennes'),
(2, 'Deauville', '30', 'Hippodrome de Deauville');

-- --------------------------------------------------------

--
-- Structure de la table `lot`
--

DROP TABLE IF EXISTS `lot`;
CREATE TABLE IF NOT EXISTS `lot` (
  `id` int(11) NOT NULL,
  `prixDepart` varchar(50) DEFAULT NULL,
  `idVente` int(11) NOT NULL,
  `idCheval` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_lot_vente` (`idVente`),
  KEY `fk_lot_cheval` (`idCheval`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `lot`
--

INSERT INTO `lot` (`id`, `prixDepart`, `idVente`, `idCheval`) VALUES
(1, '5000', 1, 1),
(2, '4500', 1, 4),
(3, '7000', 2, 2),
(4, '6500', 2, 5);

-- --------------------------------------------------------

--
-- Structure de la table `participer`
--

DROP TABLE IF EXISTS `participer`;
CREATE TABLE IF NOT EXISTS `participer` (
  `idCheval` int(11) NOT NULL,
  `idCourse` int(11) NOT NULL,
  `position` int(11) DEFAULT NULL,
  `temps` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`idCheval`,`idCourse`),
  KEY `fk_participer_course` (`idCourse`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `participer`
--

INSERT INTO `participer` (`idCheval`, `idCourse`, `position`, `temps`) VALUES
(1, 1, 1, 95.32),
(1, 2, 2, 98.45),
(2, 2, 1, 97.10),
(4, 1, 2, 99.87),
(5, 2, 3, 102.55);

-- --------------------------------------------------------

--
-- Structure de la table `pays`
--

DROP TABLE IF EXISTS `pays`;
CREATE TABLE IF NOT EXISTS `pays` (
  `code` varchar(50) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `pays`
--

INSERT INTO `pays` (`code`, `nom`) VALUES
('DE', 'Allemagne'),
('FR', 'France'),
('US', 'États-Unis');

-- --------------------------------------------------------

--
-- Structure de la table `piecejointe`
--

DROP TABLE IF EXISTS `piecejointe`;
CREATE TABLE IF NOT EXISTS `piecejointe` (
  `id` int(11) NOT NULL,
  `chemin` varchar(255) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `piecejointe`
--

INSERT INTO `piecejointe` (`id`, `chemin`, `description`) VALUES
(1, 'images/eclipse.jpg', 'Photo du cheval Eclipse'),
(2, 'images/aztec.jpg', 'Photo du cheval Aztec');

-- --------------------------------------------------------

--
-- Structure de la table `race`
--

DROP TABLE IF EXISTS `race`;
CREATE TABLE IF NOT EXISTS `race` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `race`
--

INSERT INTO `race` (`id`, `nom`) VALUES
(1, 'Pur-sang anglais'),
(2, 'Quarter Horse'),
(3, 'Frison'),
(4, 'Andalou'),
(5, 'Lipizzan'),
(6, 'Mustang');

-- --------------------------------------------------------

--
-- Structure de la table `reproducteur`
--

DROP TABLE IF EXISTS `reproducteur`;
CREATE TABLE IF NOT EXISTS `reproducteur` (
  `idCheval` int(11) NOT NULL,
  `idReproducteur` int(11) NOT NULL,
  PRIMARY KEY (`idCheval`,`idReproducteur`),
  KEY `fk_reproducteur_parent` (`idReproducteur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `reproducteur`
--

INSERT INTO `reproducteur` (`idCheval`, `idReproducteur`) VALUES
(4, 11),
(5, 12);

-- --------------------------------------------------------

--
-- Structure de la table `robe`
--

DROP TABLE IF EXISTS `robe`;
CREATE TABLE IF NOT EXISTS `robe` (
  `typeRobe` varchar(50) NOT NULL,
  `libelle` varchar(255) NOT NULL,
  PRIMARY KEY (`typeRobe`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `robe`
--

INSERT INTO `robe` (`typeRobe`, `libelle`) VALUES
('Alezan', 'poil roux, crins souvent de la même teinte.'),
('Bai', 'corps brun avec crins, extrémités et bout du nez noirs.'),
('Gris', 'mélange de poils blancs et foncés, s’éclaircissant avec l’âge.'),
('Isabelle', 'poil jaune/sable, crins noirs.'),
('Noir', 'entièrement noir.'),
('Pie', 'grandes taches blanches et colorées.');

-- --------------------------------------------------------

--
-- Structure de la table `vente`
--

DROP TABLE IF EXISTS `vente`;
CREATE TABLE IF NOT EXISTS `vente` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `idCategVente` int(11) DEFAULT NULL,
  `idLieu` int(11) DEFAULT NULL,
  `dateDebutVente` varchar(50) DEFAULT NULL,
  `dateFinVente` varchar(50) DEFAULT NULL,
  `dateDebutInscription` varchar(50) DEFAULT NULL,
  `dateEnvoiMessage` varchar(50) DEFAULT NULL,
  `objetMessage` varchar(50) DEFAULT NULL,
  `corpsMessage` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_vente_categ` (`idCategVente`),
  KEY `fk_vente_lieu` (`idLieu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `vente`
--

INSERT INTO `vente` (`id`, `nom`, `idCategVente`, `idLieu`, `dateDebutVente`, `dateFinVente`, `dateDebutInscription`, `dateEnvoiMessage`, `objetMessage`, `corpsMessage`) VALUES
(1, 'Vente Printemps', 1, 1, '2025-09-15', '2025-09-20', '2025-09-01', '2025-09-05', 'Bienvenue à la vente', 'Vente de chevaux Pur-sang à Vincennes.'),
(2, 'Vente Été', 2, 2, '2025-07-10', '2025-07-15', '2025-06-25', '2025-06-30', 'Préparez-vous', 'Vente de Quarter Horse à Deauville.'),
(3, 'vente hivernal', 1, 2, '2025-12-12', '2025-12-17', '2025-12-08', '2025-09-24 09:53:28', 'grosse vente Hivernal', 'Dernière vente de l\'année, plusieurs catégories au menu');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `attacher`
--
ALTER TABLE `attacher`
  ADD CONSTRAINT `fk_attacher_courriel` FOREIGN KEY (`idCourriel`) REFERENCES `courriel` (`id`),
  ADD CONSTRAINT `fk_attacher_piece` FOREIGN KEY (`idPieceJointe`) REFERENCES `piecejointe` (`id`);

--
-- Contraintes pour la table `avoir`
--
ALTER TABLE `avoir`
  ADD CONSTRAINT `avoir_ibfk_1` FOREIGN KEY (`id`) REFERENCES `vente` (`id`),
  ADD CONSTRAINT `avoir_ibfk_2` FOREIGN KEY (`id_1`) REFERENCES `race` (`id`);

--
-- Contraintes pour la table `cheval`
--
ALTER TABLE `cheval`
  ADD CONSTRAINT `fk_cheval_mere` FOREIGN KEY (`cheval_mere`) REFERENCES `cheval` (`id`),
  ADD CONSTRAINT `fk_cheval_pere` FOREIGN KEY (`cheval_pere`) REFERENCES `cheval` (`id`),
  ADD CONSTRAINT `fk_race` FOREIGN KEY (`race_id`) REFERENCES `race` (`id`),
  ADD CONSTRAINT `fk_typeRobe` FOREIGN KEY (`typeRobe`) REFERENCES `robe` (`typeRobe`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `client_ibfk_1` FOREIGN KEY (`code`) REFERENCES `pays` (`code`);

--
-- Contraintes pour la table `courriel`
--
ALTER TABLE `courriel`
  ADD CONSTRAINT `fk_courriel_vente` FOREIGN KEY (`idVente`) REFERENCES `vente` (`id`);

--
-- Contraintes pour la table `enchere`
--
ALTER TABLE `enchere`
  ADD CONSTRAINT `fk_enchere_client` FOREIGN KEY (`idClient`) REFERENCES `client` (`id`),
  ADD CONSTRAINT `fk_enchere_lot` FOREIGN KEY (`idLot`) REFERENCES `lot` (`id`);

--
-- Contraintes pour la table `interesser`
--
ALTER TABLE `interesser`
  ADD CONSTRAINT `fk_interesser_categ` FOREIGN KEY (`idCategVente`) REFERENCES `categvente` (`id`),
  ADD CONSTRAINT `fk_interesser_client` FOREIGN KEY (`idClient`) REFERENCES `client` (`id`);

--
-- Contraintes pour la table `lot`
--
ALTER TABLE `lot`
  ADD CONSTRAINT `fk_lot_cheval` FOREIGN KEY (`idCheval`) REFERENCES `cheval` (`id`),
  ADD CONSTRAINT `fk_lot_vente` FOREIGN KEY (`idVente`) REFERENCES `vente` (`id`);

--
-- Contraintes pour la table `participer`
--
ALTER TABLE `participer`
  ADD CONSTRAINT `fk_participer_cheval` FOREIGN KEY (`idCheval`) REFERENCES `cheval` (`id`),
  ADD CONSTRAINT `fk_participer_course` FOREIGN KEY (`idCourse`) REFERENCES `course` (`id`);

--
-- Contraintes pour la table `reproducteur`
--
ALTER TABLE `reproducteur`
  ADD CONSTRAINT `fk_reproducteur_cheval` FOREIGN KEY (`idCheval`) REFERENCES `cheval` (`id`),
  ADD CONSTRAINT `fk_reproducteur_parent` FOREIGN KEY (`idReproducteur`) REFERENCES `cheval` (`id`);

--
-- Contraintes pour la table `vente`
--
ALTER TABLE `vente`
  ADD CONSTRAINT `fk_vente_categ` FOREIGN KEY (`idCategVente`) REFERENCES `categvente` (`id`),
  ADD CONSTRAINT `fk_vente_lieu` FOREIGN KEY (`idLieu`) REFERENCES `lieu_` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
