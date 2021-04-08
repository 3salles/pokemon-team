package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTable {

    public static void main(String[] args) {

        String sql = "CREATE TABLE IF NOT EXISTS pokemons "
                + "( official_id integer NOT NULL, "
                + "name character varying(20) NOT NULL, "
                + "primary_type character varying(20) NOT NULL, "
                + "second_type character varying(20) NULL, "
                + "atk integer NOT NULL, "
                + "def integer NOT NULL, "
                + "hp integer NOT NULL, "
                + "speed integer NOT NULL, "
                + "CONSTRAINT pokemon_pkey PRIMARY KEY (official_id))";

        Connection connection = null;
        PreparedStatement pstm = null;

        try {

            connection = JdbcConnection.getConnection();
            pstm = connection.prepareStatement(sql);
            pstm.execute();

            System.out.println("Tabela criada!");

        } catch (Exception exception) {
            exception.printStackTrace();

        } finally {

            try {
                if (pstm != null) {
                    pstm.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

    }

}
