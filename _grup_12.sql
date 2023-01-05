-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost
-- Üretim Zamanı: 31 Ara 2021, 08:44:56
-- Sunucu sürümü: 8.0.26
-- PHP Sürümü: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `_grup_12`
--

DELIMITER $$
--
-- Yordamlar
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_aracBilgisi` (INOUT `_marka` VARCHAR(45), INOUT `_renk` VARCHAR(45), INOUT `_model` VARCHAR(45), INOUT `_plaka` VARCHAR(45))  BEGIN
	insert into aracbilgisi(aracBilgisiMarka,aracBilgisiRenk,aracBilgisiModel,aracBilgisiPlaka) values (_marka,_renk,_model,_plaka);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_kullanici` (INOUT `_isim` VARCHAR(25), INOUT `_soy_isim` VARCHAR(25), INOUT `_tc` VARCHAR(11))  BEGIN
	insert into kullanicilar(kullanıcılarIsim,kullanıcılarSoyIsim,kullanıcılarTc) values (_isim,_soy_isim,_tc);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_kullanici_iletisim` (INOUT `_telefon` VARCHAR(45), INOUT `_mail` VARCHAR(45))  BEGIN
	insert into kullanici_iletisim(kullanici_iletisimTelefon,kullanici_iletisimMail) values (_telefon,_mail);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_kullanıcı_aracBilgisi` (INOUT `_id` INT, INOUT `_Marka` VARCHAR(45), INOUT `_Renk` VARCHAR(45), INOUT `_Model` VARCHAR(45), INOUT `_Plaka` VARCHAR(45))  BEGIN
	update aracbilgisi
    set aracBilgisiMarka = _Marka , aracBilgisiRenk = _Renk,
    aracBilgisiModel = _Model , aracBilgisiPlaka = _Plaka
    where idaracBilgisi = _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_kullanıcı_iletisim` (INOUT `_id` INT, INOUT `_telefon` VARCHAR(45), INOUT `_mail` VARCHAR(45))  BEGIN
	update kullanici_iletisim 
    set kullanici_iletisimTelefon = _telefon , kullanici_iletisimMail = _mail 
    where idkullanıcıİletisim = _id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `_delete_kullanıcı` (INOUT `idkullanicilar` INT)  BEGIN
	delete from kln_iletisim_arac where idkln_iletisim_arac = idkullanicilar;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admin`
--

CREATE TABLE `admin` (
  `adminID` int NOT NULL,
  `adminIsim` varchar(45) NOT NULL,
  `adminKlnAdi` varchar(45) NOT NULL,
  `adminSifre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Tablo döküm verisi `admin`
--

INSERT INTO `admin` (`adminID`, `adminIsim`, `adminKlnAdi`, `adminSifre`) VALUES
(1, 'Furkan', 'Saletros', '12345'),
(2, 'Ebrar', 'Ebrar', '2468');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `aracbilgisi`
--

CREATE TABLE `aracbilgisi` (
  `idaracBilgisi` int NOT NULL,
  `aracBilgisiMarka` varchar(45) NOT NULL,
  `aracBilgisiRenk` varchar(45) NOT NULL,
  `aracBilgisiModel` varchar(45) NOT NULL,
  `aracBilgisiPlaka` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Tablo döküm verisi `aracbilgisi`
--

INSERT INTO `aracbilgisi` (`idaracBilgisi`, `aracBilgisiMarka`, `aracBilgisiRenk`, `aracBilgisiModel`, `aracBilgisiPlaka`) VALUES
(34, 'BMW', 'Beyaz', 'Tempra', '34 SRH 37'),
(35, 'BMW', 'Mavi', '320i', '06 FM 60'),
(37, 'Ford', 'Kırmızı', '16', '19 M 5121'),
(38, 'Mercedes', 'Beyaz', 'e400', '34 H 7000'),
(39, 'Opel', 'Beyaz', 'Astra', '34 AFR 153'),
(40, 'M123arka', 'Renk', '123Model', 'qw'),
(46, 'gdw', 'dfwg', 'wdfg', 'erwg');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `fis`
--

CREATE TABLE `fis` (
  `idfiş` int NOT NULL,
  `fisKln_iletisim_arac` int NOT NULL,
  `fisOtoparkid` int NOT NULL,
  `fişSüre` varchar(45) NOT NULL,
  `fişUcret` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Tablo döküm verisi `fis`
--

INSERT INTO `fis` (`idfiş`, `fisKln_iletisim_arac`, `fisOtoparkid`, `fişSüre`, `fişUcret`) VALUES
(41, 24, 14, '3 Saat ile 7 Saat Arası', '18 TL'),
(42, 22, 24, '12 Saat ile 24 Saat Arası', '45 TL'),
(43, 23, 18, '12 Saat ile 24 Saat Arası', '45 TL'),
(46, 27, 1, '12 Saat ile 24 Saat Arası', '45 TL'),
(51, 27, 11, '3saatten az', '8 TL'),
(52, 27, 22, '7 Saat ile 12 Saat Arası', '30 TL');

--
-- Tetikleyiciler `fis`
--
DELIMITER $$
CREATE TRIGGER `otopark_doluluk_guncelleme` AFTER INSERT ON `fis` FOR EACH ROW BEGIN
	update otopark set otoparkDoluluk = 1 where idotopark = new.fisOtoparkid;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `otopark_doluluk_guncelleme_0` AFTER DELETE ON `fis` FOR EACH ROW BEGIN
	update otopark set otoparkDoluluk = 0 where idotopark = old.fisOtoparkid;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kln_iletisim_arac`
--

CREATE TABLE `kln_iletisim_arac` (
  `idkln_iletisim_arac` int NOT NULL,
  `IDKln` varchar(45) NOT NULL,
  `IDİletisim` varchar(45) NOT NULL,
  `IDArac` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Tablo döküm verisi `kln_iletisim_arac`
--

INSERT INTO `kln_iletisim_arac` (`idkln_iletisim_arac`, `IDKln`, `IDİletisim`, `IDArac`) VALUES
(22, '54', '39', '34'),
(23, '55', '40', '35'),
(25, '57', '42', '37'),
(26, '58', '43', '38'),
(27, '59', '44', '39'),
(28, '60', '45', '40'),
(34, '66', '51', '46');

--
-- Tetikleyiciler `kln_iletisim_arac`
--
DELIMITER $$
CREATE TRIGGER `kullanici_aracbilgisi_silme` AFTER DELETE ON `kln_iletisim_arac` FOR EACH ROW BEGIN
	delete from aracbilgisi where idaracBilgisi = old.IDArac ;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `kullanici_iletisim_silme` AFTER DELETE ON `kln_iletisim_arac` FOR EACH ROW BEGIN
	delete from kullanici_iletisim where idkullanıcıİletisim = old.IDİletisim;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `kullanici_kln_silme` AFTER DELETE ON `kln_iletisim_arac` FOR EACH ROW BEGIN
	delete from kullanicilar where idkullanıcılar = old.IDKln ;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `idkullanıcılar` int NOT NULL,
  `kullanıcılarIsim` varchar(45) NOT NULL,
  `kullanıcılarSoyIsim` varchar(45) NOT NULL,
  `kullanıcılarTc` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`idkullanıcılar`, `kullanıcılarIsim`, `kullanıcılarSoyIsim`, `kullanıcılarTc`) VALUES
(54, 'Ebrar', 'Soy İsim', 'TC'),
(55, 'Furkan', 'Kafalı', '67990112829'),
(57, 'Erdem', 'Kardan', '262362'),
(58, 'Samed', 'Doğan', '235235'),
(59, 'Harun', 'Yakut', '4362433'),
(60, 'Fikri', 'Soy İsim', 'TC'),
(66, 'Furkan', 'Kafalı', '67990112892');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici_iletisim`
--

CREATE TABLE `kullanici_iletisim` (
  `idkullanıcıİletisim` int NOT NULL,
  `kullanici_iletisimTelefon` varchar(45) NOT NULL,
  `kullanici_iletisimMail` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Tablo döküm verisi `kullanici_iletisim`
--

INSERT INTO `kullanici_iletisim` (`idkullanıcıİletisim`, `kullanici_iletisimTelefon`, `kullanici_iletisimMail`) VALUES
(39, '011111111', 'ebrar@gmail.com'),
(40, '05078468951', 'furkankafa'),
(42, '25235', '52352'),
(43, '235235', '314124'),
(44, '232353', 'aıyufash214'),
(45, 'Telefon', 'Mail'),
(51, '05078468951', 'furkankafali15@gmail.com');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `otopark`
--

CREATE TABLE `otopark` (
  `idotopark` int NOT NULL,
  `otoparkKat` int NOT NULL,
  `otoparkNo` int NOT NULL,
  `otoparkDoluluk` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Tablo döküm verisi `otopark`
--

INSERT INTO `otopark` (`idotopark`, `otoparkKat`, `otoparkNo`, `otoparkDoluluk`) VALUES
(1, 1, 1, 1),
(2, 1, 2, 0),
(3, 1, 3, 0),
(4, 1, 4, 0),
(5, 1, 5, 0),
(6, 1, 6, 0),
(7, 1, 7, 0),
(8, 1, 8, 0),
(9, 2, 1, 0),
(10, 2, 2, 0),
(11, 2, 3, 1),
(12, 2, 4, 0),
(13, 2, 5, 0),
(14, 2, 6, 1),
(15, 2, 7, 0),
(16, 2, 8, 0),
(17, 3, 1, 0),
(18, 3, 2, 1),
(19, 3, 3, 0),
(20, 3, 4, 0),
(21, 3, 5, 0),
(22, 3, 6, 1),
(23, 3, 7, 0),
(24, 3, 8, 1);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminID`);

--
-- Tablo için indeksler `aracbilgisi`
--
ALTER TABLE `aracbilgisi`
  ADD PRIMARY KEY (`idaracBilgisi`);

--
-- Tablo için indeksler `fis`
--
ALTER TABLE `fis`
  ADD PRIMARY KEY (`idfiş`);

--
-- Tablo için indeksler `kln_iletisim_arac`
--
ALTER TABLE `kln_iletisim_arac`
  ADD PRIMARY KEY (`idkln_iletisim_arac`);

--
-- Tablo için indeksler `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`idkullanıcılar`);

--
-- Tablo için indeksler `kullanici_iletisim`
--
ALTER TABLE `kullanici_iletisim`
  ADD PRIMARY KEY (`idkullanıcıİletisim`);

--
-- Tablo için indeksler `otopark`
--
ALTER TABLE `otopark`
  ADD PRIMARY KEY (`idotopark`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `admin`
--
ALTER TABLE `admin`
  MODIFY `adminID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `aracbilgisi`
--
ALTER TABLE `aracbilgisi`
  MODIFY `idaracBilgisi` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- Tablo için AUTO_INCREMENT değeri `fis`
--
ALTER TABLE `fis`
  MODIFY `idfiş` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- Tablo için AUTO_INCREMENT değeri `kln_iletisim_arac`
--
ALTER TABLE `kln_iletisim_arac`
  MODIFY `idkln_iletisim_arac` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `idkullanıcılar` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;

--
-- Tablo için AUTO_INCREMENT değeri `kullanici_iletisim`
--
ALTER TABLE `kullanici_iletisim`
  MODIFY `idkullanıcıİletisim` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- Tablo için AUTO_INCREMENT değeri `otopark`
--
ALTER TABLE `otopark`
  MODIFY `idotopark` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
