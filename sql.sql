CREATE TABLE `ResearchPaper`(
    `PaperID` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `Title` LINESTRING NOT NULL,
    `Abstract` MULTILINESTRING NOT NULL,
    `Author` LINESTRING NOT NULL,
    `PaperStatus` LINESTRING NOT NULL,
    `UserID` INT NOT NULL,
    `DeptName` LINESTRING NOT NULL
);
CREATE TABLE `Funding`(
    `FundingID` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `PaperID` INT NOT NULL,
    `Type` LINESTRING NOT NULL,
    `Amount` DOUBLE(8, 2) NOT NULL,
    `FundingStatus` LINESTRING NOT NULL
);
CREATE TABLE `Departrment`(
    `DeptName` LINESTRING NOT NULL,
    `DeptID` INT NOT NULL,
    `NoOfResearch` INT NOT NULL
);
ALTER TABLE
    `Departrment` ADD PRIMARY KEY(`DeptName`);
CREATE TABLE `User`(
    `UserID` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `UserName` LINESTRING NOT NULL,
    `Password` LINESTRING NOT NULL,
    `Role` LINESTRING NOT NULL,
    `DeptName` LINESTRING NOT NULL
);
CREATE TABLE `Patent`(
    `PatentID` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `PaperID` INT NOT NULL,
    `PatentNumber` INT NOT NULL,
    `PatentStatus` LINESTRING NOT NULL
);
ALTER TABLE
    `User` ADD CONSTRAINT `user_deptname_foreign` FOREIGN KEY(`DeptName`) REFERENCES `Departrment`(`DeptName`);
ALTER TABLE
    `Patent` ADD CONSTRAINT `patent_paperid_foreign` FOREIGN KEY(`PaperID`) REFERENCES `ResearchPaper`(`PaperID`);
ALTER TABLE
    `ResearchPaper` ADD CONSTRAINT `researchpaper_userid_foreign` FOREIGN KEY(`UserID`) REFERENCES `User`(`UserID`);
ALTER TABLE
    `Funding` ADD CONSTRAINT `funding_paperid_foreign` FOREIGN KEY(`PaperID`) REFERENCES `ResearchPaper`(`PaperID`);