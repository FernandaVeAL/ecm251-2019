package auxiliar_database;


import model.Jogo;
import utilities.Constants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class SingletonJogosDAO {
    private Connection connection;
    private static SingletonJogosDAO instance = null;
    public static SingletonJogosDAO getInstance(){
        if(instance == null)
            instance = new SingletonJogosDAO(Constants.URL_MEU_BANCO);
        return instance;
    }
    private SingletonJogosDAO(String myConnection){
        try {
            connection = DriverManager.getConnection(myConnection);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
            connection = null;
        }
    }
    public boolean insertJogo(Jogo game){
        PreparedStatement comandoSQL;
        try {
            //comandoSQL = connection.prepareStatement(Constants.getInsert("jogos",5));
            comandoSQL = connection.prepareStatement("INSERT INTO jogos VALUES (?, ?, ?,?, ?);");
            comandoSQL.setString(2,game.nome);
            comandoSQL.setString(3,game.genero);
            comandoSQL.setString(4,game.plataforma);
            comandoSQL.setString(5,game.lancamento);
            comandoSQL.setNull(1,Types.INTEGER);
            comandoSQL.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }catch (NullPointerException e){
            e.printStackTrace();
            return false;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public List<Jogo> getAllJogo(){
        List<Jogo> games = new ArrayList<>();
        try {
            Statement comandoSql = connection.createStatement();
            //ResultSet rs = comandoSql.executeQuery(Constants.selectAll("jogos"));
            ResultSet rs = comandoSql.executeQuery("SELECT * FROM jogos");
            while(rs.next()){
                Jogo game = new Jogo(
                        rs.getString("nome"),
                        rs.getString("genero"),
                        rs.getString("plataforma"),
                        rs.getString("lancamento")
                );
                game.id = rs.getInt("id");
                games.add(game);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return games;
    }
    public List<Jogo> getAllJogoByName(String nome) {
        List<Jogo> games = new ArrayList<>();
        try {
            Statement comandoSql = connection.createStatement();
            //ResultSet rs = comandoSql.executeQuery(Constants.selectAll("jogos"));
            ResultSet rs = comandoSql.executeQuery("SELECT * FROM jogos WHERE nome LIKE'%" + nome + "%';");
            while(rs.next()){
                Jogo game = new Jogo(
                        rs.getString("nome"),
                        rs.getString("genero"),
                        rs.getString("plataforma"),
                        rs.getString("lancamento")
                );
                game.id = rs.getInt("id");
                games.add(game);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return games;
    }

    public List<Jogo> getAllJogoByType(String genero) {
        List<Jogo> games = new ArrayList<>();
        try {
            Statement comandoSql = connection.createStatement();
            //ResultSet rs = comandoSql.executeQuery(Constants.selectAll("jogos"));
            ResultSet rs = comandoSql.executeQuery("SELECT * FROM jogos WHERE genero LIKE'%" + genero + "%';");
            while(rs.next()){
                Jogo game = new Jogo(
                        rs.getString("nome"),
                        rs.getString("genero"),
                        rs.getString("plataforma"),
                        rs.getString("lancamento")
                );
                game.id = rs.getInt("id");
                games.add(game);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return games;
    }

    public List<Jogo> getAllJogoByPlataform(String plataforma) {
        List<Jogo> games = new ArrayList<>();
        try {
            Statement comandoSql = connection.createStatement();
            //ResultSet rs = comandoSql.executeQuery(Constants.selectAll("jogos"));
            ResultSet rs = comandoSql.executeQuery("SELECT * FROM jogos WHERE plataforma LIKE'%" + plataforma + "%';");
            while(rs.next()){
                Jogo game = new Jogo(
                        rs.getString("nome"),
                        rs.getString("genero"),
                        rs.getString("plataforma"),
                        rs.getString("lancamento")
                );
                game.id = rs.getInt("id");
                games.add(game);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return games;
    }

    public void updateJogo(Jogo jogo) {
        try {
            Statement comandoSql = connection.createStatement();
            comandoSql.executeUpdate("UPDATE jogos SET "+
                    "nome=\"" + jogo.nome + "\"," +
                    "genero=\"" + jogo.genero + "\"," +
                    "plataforma=\"" + jogo.plataforma + "\"," +
                    "lancamento=\"" + jogo.lancamento + "\"" +
                    " WHERE id=" + jogo.id+";");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteById(int id) {
        try {
            Statement comandoSql = connection.createStatement();
            comandoSql.executeUpdate(
                    "DELETE FROM jogos WHERE id=" + id+";"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }

