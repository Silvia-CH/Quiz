package com.example.hoja11.BD;

import com.example.hoja11.objetos.Ending;
import com.example.hoja11.objetos.Pregunta;
import com.example.hoja11.objetos.Pregunta_has_Respuesta;
import com.example.hoja11.objetos.Respuesta;

import java.sql.*;
import java.lang.String;


public class AccederBD {
    public static Pregunta selectPregunta(int id, char rasgo) {
        Connection conexion = null;
        Statement sentenciaSQL = null;
        ResultSet rs;
        String sql = "";
        Pregunta pregunta = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja11", "root", "");

            sentenciaSQL = conexion.createStatement();

            sql = "SELECT * FROM pregunta WHERE idPregunta = " + id + " AND rasgoPregunta = '" + rasgo + "';";

            rs = sentenciaSQL.executeQuery(sql);

            while (rs.next()) {
                pregunta = new Pregunta(id, rs.getString(2), rs.getString(3).charAt(0));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (sentenciaSQL != null) {
                    sentenciaSQL.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return pregunta;
    }

    public static Respuesta selectRespuesta(int id) {
        Connection conexion = null;
        Statement sentenciaSQL = null;
        ResultSet rs;
        String sql = "";
        Respuesta respuesta = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja11", "root", "");

            sentenciaSQL = conexion.createStatement();

            sql = "SELECT * FROM respuesta WHERE idRespuesta = " + id + ";";

            rs = sentenciaSQL.executeQuery(sql);

            while (rs.next()) {
                respuesta = new Respuesta(id, rs.getString(2), rs.getString(3).charAt(0), rs.getInt(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (sentenciaSQL != null) {
                    sentenciaSQL.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return respuesta;
    }

    public static Pregunta_has_Respuesta selectPregunta_has_Respuesta(int id) {
        Connection conexion = null;
        Statement sentenciaSQL = null;
        ResultSet rs;
        String sql = "";
        Pregunta_has_Respuesta item = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja11", "root", "");

            sentenciaSQL = conexion.createStatement();

            sql = "SELECT * FROM pregunta_has_respuesta WHERE pregunta_id = " + id + ";";

            rs = sentenciaSQL.executeQuery(sql);

            while (rs.next()) {
                item = new Pregunta_has_Respuesta(id, rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (sentenciaSQL != null) {
                    sentenciaSQL.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return item;
    }

    public static Ending selectFinal(int rasgoA, int rasgoB, int rasgoC, int rasgoD) {
        Connection conexion = null;
        Statement sentenciaSQL = null;
        ResultSet rs;
        String sql = "";
        Ending end = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja11", "root", "");

            sentenciaSQL = conexion.createStatement();

            sql = "SELECT * FROM final WHERE rasgoA=" + rasgoA + " AND rasgoB=" + rasgoB + " AND rasgoC=" + rasgoC + " AND rasgoD=" + rasgoD + ";";

            System.out.println(sql);
            rs = sentenciaSQL.executeQuery(sql);

            while (rs.next()) {
                end = new Ending(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (sentenciaSQL != null) {
                    sentenciaSQL.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return end;
    }
}
