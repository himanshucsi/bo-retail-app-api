
-- 1 Customer Table Creation

CREATE TABLE [customer] (
  [id] [INT] NOT NULL IDENTITY(1,1),
  [name] [VARCHAR](100) NULL DEFAULT NULL,
  [email] [VARCHAR](500) NOT NULL,
  [password] [VARCHAR](500) NOT NULL,
  [gender] [VARCHAR](100) NULL DEFAULT NULL,
  [dob] [VARCHAR](100) NULL DEFAULT NULL,
  [address] [VARCHAR](100) NULL DEFAULT NULL,
  [phone] [VARCHAR](100) NULL DEFAULT NULL,
  CONSTRAINT [PK_ID] PRIMARY KEY CLUSTERED
  (
	[id] ASC
  ));
CREATE UNIQUE INDEX email ON [customer] ([email]);

-- 2 Admin Table

CREATE TABLE  [admin] (
  [admin_id] [INT] NOT NULL IDENTITY(1,1),
  [name] [VARCHAR](100) NULL DEFAULT NULL,
  [email] [VARCHAR](100) NULL DEFAULT NULL,
  [contact] [VARCHAR](100) NULL DEFAULT NULL,
  [password] [VARCHAR](100) NULL DEFAULT NULL,
  [address] [VARCHAR](100) NULL DEFAULT NULL,
  CONSTRAINT [PK_ADMIN_ID] PRIMARY KEY CLUSTERED
  (
	[admin_id] ASC
  ));
  

-- 3 Store Table

CREATE TABLE  [store] (
  [store_id] [INT] NOT NULL IDENTITY(1,1),
  [state] [VARCHAR](100) NULL DEFAULT NULL,
  [city] [VARCHAR](100) NULL DEFAULT NULL,
  [road_no] [VARCHAR](50) NULL DEFAULT NULL,
  [store_license_no] [VARCHAR](20) NOT NULL,
  
  CONSTRAINT [PK_STORE_ID] PRIMARY KEY CLUSTERED
  (
	[store_id] ASC
  ));
CREATE UNIQUE INDEX store_license_no_UNIQUE ON [store] ([store_license_no]);

    
-- 4 Supplier Table
  
CREATE TABLE  [supplier] (
  [supplier_id] INT NOT NULL IDENTITY(1,1),
  [name] [VARCHAR](100) NULL DEFAULT NULL,
  [email] [VARCHAR](100) NOT NULL,
  [dob] [VARCHAR](100) NULL DEFAULT NULL,
  [address] [VARCHAR](100) NULL DEFAULT NULL,
  [phone] [VARCHAR](100) NULL DEFAULT NULL,
  CONSTRAINT [PK_SUPPLIER_ID] PRIMARY KEY CLUSTERED
  (
	[supplier_id] ASC
  ));
CREATE UNIQUE INDEX email_UNIQUE ON [supplier] ([email]);

-- 5 Product Table Creation

CREATE TABLE  [products] (
  [product_id] [INT] NOT NULL IDENTITY(1,1),
  [store_id] [INT] NULL DEFAULT NULL,
  [expiry_date] [VARCHAR](10) NULL DEFAULT NULL,
  [price] [INT] NULL DEFAULT NULL,
  [supplier_id] [INT] NULL DEFAULT NULL,
  [category] [VARCHAR](100) NULL DEFAULT 'TOY',
  CONSTRAINT [PK_PRODUCT_ID] PRIMARY KEY CLUSTERED
  (
	[product_id] ASC
  ));
  
  CREATE INDEX products_ibfk_1 ON [products] ([supplier_id]);
  CREATE INDEX store_ibfk_2_idx ON [products] ([store_id]);
  
  ALTER TABLE [products] WITH CHECK ADD CONSTRAINT [products_ibfk_1] FOREIGN KEY([supplier_id])
  REFERENCES [supplier] ([supplier_id])
  ON DELETE CASCADE
  ON UPDATE CASCADE;
  
  ALTER TABLE [products] WITH CHECK ADD CONSTRAINT [store_ibfk_2] FOREIGN KEY([store_id])
  REFERENCES [store] ([store_id])
  ON DELETE CASCADE
  ON UPDATE CASCADE;
  
-- 6 Employee Table Creation
    
CREATE TABLE  [employee] (
  [emp_id] [INT] NOT NULL IDENTITY(1,1),
  [name] [VARCHAR](100) NULL DEFAULT NULL,
  [email] [VARCHAR](199) NOT NULL,
  [joining_date] [VARCHAR](10) NULL DEFAULT NULL,
  [store_id] [INT] NULL DEFAULT NULL,
  [salary] [INT] NULL DEFAULT NULL,
  [phone] [VARCHAR](50) NULL DEFAULT NULL,
  CONSTRAINT [PK_EMP_ID] PRIMARY KEY CLUSTERED
  (
	[emp_id] ASC
  ));
  CREATE UNIQUE INDEX email ON [employee] ([email]);
  CREATE INDEX employee_ibfk_1 ON [employee] ([store_id]);
  ALTER TABLE [employee] WITH CHECK ADD CONSTRAINT [employee_ibfk_1] FOREIGN KEY([store_id])
  REFERENCES [dbo].[store] ([store_id])
  ON DELETE CASCADE
  ON UPDATE CASCADE;

-- 7 Cart Table

CREATE TABLE  [cart] (
  [cart_id] [INT] NOT NULL IDENTITY(1,1),
  [name] [VARCHAR](199) NULL DEFAULT NULL,
  [email] [VARCHAR](200) NULL DEFAULT NULL,
  [product_id] [INT] NULL DEFAULT NULL,
  [quantity] [INT] NULL DEFAULT NULL,
  [total_price] [INT] NULL DEFAULT NULL,
  [store_id] [INT] NULL DEFAULT NULL,
  CONSTRAINT [PK_CART_ID] PRIMARY KEY CLUSTERED
  (
	[cart_id] ASC
  ));
  CREATE INDEX product_id ON [cart] ([product_id]);
  CREATE INDEX store_id ON [cart] ([store_id]);
  ALTER TABLE [cart] WITH CHECK ADD CONSTRAINT [cart_ibfk_1] FOREIGN KEY([product_id])
  REFERENCES [products] ([product_id])
  ALTER TABLE [cart] WITH CHECK ADD CONSTRAINT [cart_ibfk_2] FOREIGN KEY([store_id])
  REFERENCES [store] ([store_id])


-- 8 Complaint Table
  
CREATE TABLE  [complaint] (
  [complaint_id] [INT] NOT NULL IDENTITY(1,1),
  [store_id] [INT] NULL DEFAULT NULL,
  [product_id] [INT] NULL DEFAULT NULL,
  [description] [VARCHAR](199) NULL DEFAULT NULL,
  [complaint_date] [VARCHAR](199) NULL DEFAULT NULL,
  [customer_email] [VARCHAR](199) NULL DEFAULT NULL,
  CONSTRAINT [PK_COMPLAINT_ID] PRIMARY KEY CLUSTERED
  (
	[complaint_id] ASC
  ));
  CREATE INDEX complaint_ibfk_1 ON [complaint] ([store_id]);
  CREATE INDEX complaint_ibfk_2 ON [complaint] ([product_id]);
  ALTER TABLE [complaint] WITH CHECK ADD CONSTRAINT [complaint_ibfk_1] FOREIGN KEY([store_id])
  REFERENCES [store] ([store_id])
  ON DELETE CASCADE
  ON UPDATE CASCADE;
  ALTER TABLE [complaint] WITH CHECK ADD CONSTRAINT [complaint_ibfk_2] FOREIGN KEY([product_id])
  REFERENCES [products] ([product_id])
  ON DELETE CASCADE
  ON UPDATE CASCADE;

  
-- 9 Order Table 
 
CREATE TABLE  [orders] (
  [order_id] [INT] NOT NULL IDENTITY(1,1),
  [name] [VARCHAR](100) NULL DEFAULT NULL,
  [email] [VARCHAR](100) NULL DEFAULT NULL,
  [product_id] [INT] NULL DEFAULT NULL,
  [quantity] [INT] NULL DEFAULT NULL,
  [total_price] [INT] NULL DEFAULT NULL,
  [store_id] [INT] NULL DEFAULT NULL,
  CONSTRAINT [PK_ORDER_ID] PRIMARY KEY CLUSTERED
  (
	[order_id] ASC
  ));
  CREATE UNIQUE INDEX product_id ON [orders] ([product_id]);
  CREATE UNIQUE INDEX store_id ON [orders] ([store_id]);
  ALTER TABLE [orders] WITH CHECK ADD CONSTRAINT [orders_ibfk_1] FOREIGN KEY([product_id])
  REFERENCES [products] ([product_id])
  ON DELETE CASCADE
  ON UPDATE CASCADE;
  ALTER TABLE [orders] WITH CHECK ADD CONSTRAINT [orders_ibfk_2] FOREIGN KEY([store_id])
  REFERENCES [store] ([store_id])
  ON DELETE CASCADE
  ON UPDATE CASCADE;

  
  