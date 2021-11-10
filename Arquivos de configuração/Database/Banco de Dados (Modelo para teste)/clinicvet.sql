-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 10-Dez-2020 às 15:30
-- Versão do servidor: 10.4.17-MariaDB
-- versão do PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `clinicvet`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `animal`
--

CREATE TABLE `animal` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `raca` varchar(50) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `peso` double NOT NULL,
  `altura` double NOT NULL,
  `id_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `animal`
--

INSERT INTO `animal` (`id`, `nome`, `raca`, `descricao`, `peso`, `altura`, `id_cliente`) VALUES
(1, 'Ada Lovelace', 'Felina', 'Fêmea', 2.5, 0.4, 98),
(2, 'Freddy Krueger', 'Felina', 'Macho', 4.5, 0.6, 100),
(6, 'Orfeu Silva', 'Labrador', 'Cachorro porte médio', 6, 0.9, 106),
(7, 'Jholly', 'Vira-lata', 'Cadela porte médio', 4.6, 0.9, 97);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(30) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `endereco` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `cpf`, `tel`, `endereco`) VALUES
(96, 'Hayden Yates', '16210227 9433', '+55 (48) 98624-7105', '4477 Mus. Street'),
(97, 'Caesar Bennett', '16800605 7510', '+55 (45) 92178-2445', '648-2396 Risus Road'),
(98, 'Wendy Bryant', '16720712 0101', '+55 (33) 93024-5932', 'P.O. Box 108, 9722 Nibh St.'),
(99, 'Keelie Ayala', '16820723 1328', '+55 (77) 93557-9483', 'P.O. Box 115, 5810 Convallis Av.'),
(100, 'Judah Grant', '16830915 9484', '+55 (83) 93206-5884', 'Ap #656-7324 Nisl Av.'),
(101, 'Kaden Weiss', '16861230 5931', '+55 (67) 93423-5023', 'Ap #744-7974 Orci Av.'),
(102, 'Mollie Herrera', '16390402 4688', '+55 (50) 95083-6210', '474-5126 Libero. Avenue'),
(103, 'Genevieve Gilliam', '16970221 4991', '+55 (41) 97936-2248', '5804 Adipiscing Street'),
(104, 'Ella Stafford', '16520408 2415', '+55 (12) 98354-0775', '728-2898 Tellus. Road'),
(105, 'Buckminster Case', '16211021 4380', '+55 (98) 95433-0040', '795-8509 Nibh Rd.'),
(106, 'Ginger Richardson', '16861203 9274', '+55 (86) 95687-1957', 'Ap #655-1125 Eu Avenue'),
(107, 'Clayton Garner', '16790829 9931', '+55 (68) 92304-6780', '552-7855 Dignissim St.'),
(108, 'Hector Bradley', '16890116 4197', '+55 (99) 97562-3962', 'P.O. Box 693, 6286 Auctor Avenue'),
(109, 'Helen Calderon', '16770101 3109', '+55 (69) 96033-5078', 'Ap #109-8893 Sed Street'),
(110, 'Rigel Harrell', '16241016 2933', '+55 (78) 96561-7571', 'Ap #456-7482 Erat St.'),
(111, 'Hanae Pittman', '16810803 6339', '+55 (21) 99449-7381', 'Ap #576-2840 Non Ave'),
(112, 'Zephania Hobbs', '16431116 2079', '+55 (86) 96449-9690', '632-8990 Pharetra, Street'),
(113, 'Madaline Peck', '16870628 3689', '+55 (11) 99716-9384', 'P.O. Box 401, 7854 Auctor. Road'),
(114, 'Juliet Hughes', '16200626 9407', '+55 (22) 92692-9546', '807-4725 Leo. Avenue'),
(115, 'Deborah Haley', '16600627 3582', '+55 (11) 94651-0360', '780-4985 Adipiscing Street'),
(116, 'Sage Wilson', '16650501 5864', '+55 (64) 94721-6910', '109-457 Aliquam Rd.'),
(117, 'Brianna Holmes', '16791103 9480', '+55 (23) 97594-0338', '456 Condimentum. Av.'),
(118, 'Patrick Ramos', '16140221 4702', '+55 (83) 93086-6838', '215-188 Tincidunt St.'),
(119, 'Alana Rosales', '16390713 0342', '+55 (64) 94429-5873', 'P.O. Box 938, 7087 Euismod Ave'),
(120, 'Tatyana Salinas', '16661101 1542', '+55 (99) 96575-1785', 'P.O. Box 553, 7807 Tellus Ave'),
(121, 'Chase Beach', '16140307 7454', '+55 (95) 95065-6860', '116-3305 Varius. Rd.'),
(122, 'Carter Jensen', '16990423 2403', '+55 (59) 97582-4345', '758 Nascetur Avenue'),
(123, 'Baxter Hewitt', '16220712 3767', '+55 (26) 93634-7456', '559-1003 Vitae Street'),
(124, 'Audrey Fields', '16870603 2581', '+55 (83) 98024-0792', 'Ap #611-5010 Nunc St.'),
(125, 'Skyler Moss', '16480414 4865', '+55 (55) 98882-9994', '461-5343 Mus. Street');

-- --------------------------------------------------------

--
-- Estrutura da tabela `consulta`
--

CREATE TABLE `consulta` (
  `id` int(11) NOT NULL,
  `sintomas` varchar(150) NOT NULL,
  `data` date NOT NULL,
  `turno` varchar(30) NOT NULL,
  `diagnostico` varchar(150) DEFAULT NULL,
  `id_animal` int(11) NOT NULL,
  `id_animal_cliente` int(11) NOT NULL,
  `id_veterinario` int(11) NOT NULL,
  `id_secretaria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `consulta`
--

INSERT INTO `consulta` (`id`, `sintomas`, `data`, `turno`, `diagnostico`, `id_animal`, `id_animal_cliente`, `id_veterinario`, `id_secretaria`) VALUES
(7, 'Problema para comer', '2020-12-12', 'Vespertino', NULL, 1, 98, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `exames`
--

CREATE TABLE `exames` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `id_veterinario` int(11) NOT NULL,
  `id_consulta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id` int(10) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `cpf` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id`, `nome`, `endereco`, `cpf`) VALUES
(1, 'Carl Acosta', 'P.O. Box 355, 7341 Pede. Avenue', '16910121 1986'),
(2, 'Burke Irwin', '438-7813 Et Rd.', '16340905 6482'),
(3, 'Dean Buchanan', '758-1370 Vulputate St.', '16041209 0672'),
(4, 'Autumn Garrett', '6391 Mattis. St.', '16491108 8930'),
(5, 'Maia Kramer', 'P.O. Box 334, 3808 Nam Street', '16570628 4691'),
(6, 'Yetta Holmes', 'P.O. Box 917, 810 Class St.', '16920708 7801'),
(7, 'Aidan Banks', '545-3043 Rhoncus Av.', '16671205 2379'),
(8, 'Adrian Rivas', 'P.O. Box 670, 1766 Tempor Road', '16510203 8329'),
(9, 'Norman Montoya', '115-3379 Est, St.', '16980913 2732'),
(10, 'Gloria Nichols', 'P.O. Box 967, 8270 Egestas Rd.', '16800322 7504'),
(11, 'Gage Stanton', '8871 Aenean Rd.', '16521101 7461'),
(12, 'Dorian Hansen', '9190 A Rd.', '16890101 1828'),
(13, 'Cara York', 'Ap #178-1258 Quis, Ave', '16290110 3628'),
(14, 'Leo Church', '822-9999 Mi. St.', '16671011 5905'),
(15, 'Aaron Lester', '3395 Luctus, Street', '16790911 8197'),
(16, 'Paula Dyer', 'Ap #725-3925 Risus Ave', '16370615 5912'),
(17, 'Aspen Mccoy', '5451 Aliquet Road', '16900108 0473'),
(18, 'Octavius Rivas', 'P.O. Box 986, 8816 At, Road', '16420414 6825'),
(19, 'Alika Pratt', '2755 Sed, St.', '16910314 3823'),
(20, 'Wynter Eaton', 'Ap #353-2299 Fringilla Road', '16150421 3065'),
(21, 'Timon Foster', 'Ap #998-6118 Turpis. Av.', '16390419 4911'),
(22, 'Guinevere Cantrell', 'P.O. Box 512, 9452 Quis Road', '16690510 4995'),
(23, 'Jennifer Greene', '8326 Sed Street', '16200630 1408'),
(24, 'Bethany Wiggins', 'P.O. Box 921, 9273 Nec Street', '16581215 3533'),
(25, 'Brian George', 'Ap #637-2055 Fusce St.', '16640504 3222'),
(26, 'Walter Henson', '680-5133 Egestas Ave', '16760522 4836'),
(27, 'Ria Campos', 'P.O. Box 830, 5999 Integer Rd.', '16250818 3486'),
(28, 'Regan Ramirez', '2760 Nisi Street', '16610910 0963'),
(29, 'Zeph Hahn', '616-2636 Nulla Rd.', '16870109 3828'),
(30, 'Pearl Pacheco', '943-9900 Amet Av.', '16880811 1531');

-- --------------------------------------------------------

--
-- Estrutura da tabela `secretaria`
--

CREATE TABLE `secretaria` (
  `id` int(11) NOT NULL,
  `id_funcionario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `secretaria`
--

INSERT INTO `secretaria` (`id`, `id_funcionario`) VALUES
(1, 4),
(5, 7),
(6, 10),
(2, 24);

-- --------------------------------------------------------

--
-- Estrutura da tabela `veterinario`
--

CREATE TABLE `veterinario` (
  `id` int(11) NOT NULL,
  `crmv` varchar(50) NOT NULL,
  `id_funcionario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `veterinario`
--

INSERT INTO `veterinario` (`id`, `crmv`, `id_funcionario`) VALUES
(1, '17632', 15),
(2, '12783', 13),
(3, '98233', 18),
(4, '63823', 21),
(5, '24362', 22),
(6, '86457', 5);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `animal`
--
ALTER TABLE `animal`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_animal` (`id_animal`),
  ADD KEY `id_animal_cliente` (`id_animal_cliente`),
  ADD KEY `id_veterinario` (`id_veterinario`),
  ADD KEY `id_secretaria` (`id_secretaria`);

--
-- Índices para tabela `exames`
--
ALTER TABLE `exames`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_veterinario` (`id_veterinario`),
  ADD KEY `id_consulta` (`id_consulta`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `secretaria`
--
ALTER TABLE `secretaria`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_funcionario` (`id_funcionario`);

--
-- Índices para tabela `veterinario`
--
ALTER TABLE `veterinario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_funcionario` (`id_funcionario`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `animal`
--
ALTER TABLE `animal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=126;

--
-- AUTO_INCREMENT de tabela `consulta`
--
ALTER TABLE `consulta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `exames`
--
ALTER TABLE `exames`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de tabela `secretaria`
--
ALTER TABLE `secretaria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `veterinario`
--
ALTER TABLE `veterinario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `animal`
--
ALTER TABLE `animal`
  ADD CONSTRAINT `animal_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`);

--
-- Limitadores para a tabela `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `consulta_ibfk_1` FOREIGN KEY (`id_animal`) REFERENCES `animal` (`id`),
  ADD CONSTRAINT `consulta_ibfk_2` FOREIGN KEY (`id_animal_cliente`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `consulta_ibfk_3` FOREIGN KEY (`id_veterinario`) REFERENCES `veterinario` (`id`),
  ADD CONSTRAINT `consulta_ibfk_4` FOREIGN KEY (`id_secretaria`) REFERENCES `secretaria` (`id`);

--
-- Limitadores para a tabela `exames`
--
ALTER TABLE `exames`
  ADD CONSTRAINT `exames_ibfk_1` FOREIGN KEY (`id_veterinario`) REFERENCES `veterinario` (`id`),
  ADD CONSTRAINT `exames_ibfk_2` FOREIGN KEY (`id_consulta`) REFERENCES `consulta` (`id`);

--
-- Limitadores para a tabela `secretaria`
--
ALTER TABLE `secretaria`
  ADD CONSTRAINT `secretaria_ibfk_1` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionario` (`id`);

--
-- Limitadores para a tabela `veterinario`
--
ALTER TABLE `veterinario`
  ADD CONSTRAINT `veterinario_ibfk_1` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionario` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
