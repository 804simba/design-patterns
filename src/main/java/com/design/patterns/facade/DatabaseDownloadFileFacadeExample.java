package com.design.patterns.facade;

/*
* In this example, the DatabaseDownloadFacade provides simplified methods to download CSV or JSON files from
* both MySQL and MongoDB databases. The client code interacts with the facade
* to perform download operations without needing to understand the complexities of the individual subsystems.
* */
public class DatabaseDownloadFileFacadeExample {
    public static void main(String[] args) {
        DatabaseDownloadFacade facade = new DatabaseDownloadFacade();

        // Download CSV from MySQL
        facade.downloadCSVFromMySQL("SELECT * FROM users");

        // Download JSON from MySQL
        facade.downloadJSONFromMySQL("SELECT * FROM orders");

        // Download CSV from MongoDB
        facade.downloadCSVFromMongoDB("db.users.find()");

        // Download JSON from MongoDB
        facade.downloadJSONFromMongoDB("db.orders.find()");
    }
}

// subsystem classes
class SQLServerDatabase {

    public void connect() {
        System.out.println("Connecting to MySQL database");
    }

    public String executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
        return "data";
    }

    public void disconnect() {
        System.out.println("Disconnecting from MySQL database");
    }
}

class MongoDBDatabase {
    public void connect() {
        System.out.println("Connecting to MongoDB database");
    }

    public String executeQuery(String query) {
        System.out.println("Executing MongoDB query: " + query);
        return "data";
    }

    public void disconnect() {
        System.out.println("Disconnecting from MongoDB database");
    }
}

class CSVDownloader {
    public void downloadCSV(String data) {
        System.out.println("Downloading CSV file with data: " + data);
    }
}

class JSONDownloader {
    public void downloadJSON(String data) {
        System.out.println("Downloading JSON file with data:  " + data);
    }
}

// facade class
class DatabaseDownloadFacade {
    private final SQLServerDatabase sqlServerDatabase;
    private final MongoDBDatabase mongoDBDatabase;
    private final JSONDownloader jsonDownloader;
    private final CSVDownloader csvDownloader;

    public DatabaseDownloadFacade() {
        this.sqlServerDatabase = new SQLServerDatabase();
        this.mongoDBDatabase = new MongoDBDatabase();
        this.csvDownloader = new CSVDownloader();
        this.jsonDownloader = new JSONDownloader();
    }

    // Facade methods to simplify interactions

    public void downloadCSVFromMySQL(String query) {
        sqlServerDatabase.connect();
        String result = sqlServerDatabase.executeQuery(query);
        csvDownloader.downloadCSV(result);
        sqlServerDatabase.disconnect();
    }

    public void downloadJSONFromMySQL(String query) {
        sqlServerDatabase.connect();
        String result = sqlServerDatabase.executeQuery(query);
        jsonDownloader.downloadJSON(result);
        sqlServerDatabase.disconnect();
    }

    public void downloadCSVFromMongoDB(String query) {
        mongoDBDatabase.connect();
        String result = mongoDBDatabase.executeQuery(query);
        csvDownloader.downloadCSV(result);
        mongoDBDatabase.disconnect();
    }

    public void downloadJSONFromMongoDB(String query) {
        mongoDBDatabase.connect();
        String result = mongoDBDatabase.executeQuery(query);
        jsonDownloader.downloadJSON(result);
        mongoDBDatabase.disconnect();
    }
}