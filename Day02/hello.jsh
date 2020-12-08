IntStream.range(0, 5).forEach(it -> System.out.println("hello world"))
String data = "Sample data"
Files.write(Paths.get("./sample.txt"), data.getBytes())
System.out.println("Done")