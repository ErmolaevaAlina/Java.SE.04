class Main{
    public static void main(String[] args) {
        String javaReservedWorlds = "C:\\Users\\Livon\\Desktop\\JavaHomework4\\se04task1\\resources\\JavaReservedWorlds.txt";
        String inputFile             = "C:\\Users\\Livon\\Desktop\\JavaHomework4\\se04task1\\src\\Parser.java";
        String outputFile            = "outputFile.txt";

        Parser parser = new Parser();
        parser.countJavaWords(javaReservedWorlds, inputFile, outputFile);

    }
}
