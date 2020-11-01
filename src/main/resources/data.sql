DROP TABLE IF EXISTS cluster;

CREATE TABLE cluster (
  cluster_id INT AUTO_INCREMENT  PRIMARY KEY,
  cluster_name VARCHAR(250) NOT NULL,
  cluster_description VARCHAR(250)
);

INSERT INTO cluster (cluster_name, cluster_description) VALUES
  ('Red', 'Cluster Red'),
  ('Blue', 'Cluster Blue'),
  ( 'Green', 'Cluster Green');
