# Files Utils

>Hint: You can use the File class from the standard Java library for the implementation of the utils below (https://www.geeksforgeeks.org/file-class-in-java/).

## 1. Directory Traversal

Write a recursive method `void traverseDirectories(String path)` which prints the names of all files in the given `path`  

### Example usage

```java
String path = Paths.get("demo").toAbsolutePath().toString();
FilesUtils.traverseDirectories(path);
```

### Expected output

```
demo:
  nested-1:
    file-1.md
    file-2.md
    file-3.md
    nested-1-1:
      example.txt
  nested-2:
    test-1.csv
    test-2.txt
    test-3.md
```

## 2. Find Files

Write method `List<String> findFiles(String path, String extension)` which return a collection of all files which have the given `extension` in the given directory.

### Example usage

```java
String path = Paths.get("demo").toAbsolutePath().toString();
System.out.println(findFiles(path, "md"));
```

### Expected output

```
[file-1.md, file-2.md, file-3.md, test-3.md]
```

### 3. File Exists

Write a recursive method `boolean fileExists(String path, String fileName)`

### Example usage

```java
String path = Paths.get("demo").toAbsolutePath().toString();
System.out.println(fileExists(path, "test-3.md"));
System.out.println(fileExists(path, "test-2.md"));
```

### Expected Output

```
true
false
```

### 4. Directory Stats

Write a recursive method `Map<String, Integer> getDirectoryStats(String path)` which returns the number of files for each file extension.

### Example usage

```java
String path = Paths.get("demo").toAbsolutePath().toString();
System.out.println(FilesUtils.getDirectoryStats(path));
```

### Expected Output

```
{txt=2, md=4, csv=1}
```
