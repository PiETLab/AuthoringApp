# Treasure Box Braille Apps

This repository is dedicated to both **Authoring App** and **SCALP App**.

  * **Authoring App**: This is a GUI application that enables the creation of `Scenario` files.
    * Scenarios are text files that together with some associated audio files will be executed by the Raspberry Pi 2.
    * This app responsibility is to output a formatted text file and associated it with the correct audio files.

  * **SCALP**: This app is responsible for running the `Scenario` files inside the Raspberry Pi 2.
    * `SCALP` means Select-(as per)-Config-and-Launch-Player
    * `SCALP` also contains a separate repository called [`SCALP Scripts`](https://github.com/PiETLab/SCALPScripts) which are a series of `bash script` files that automatically feed the `Scenario` files into the `SCALP App`

## How to run both apps in development mode

1. Download [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/release/2018-09/r/eclipse-ide-java-developers)


2. Import the project using Eclipse
  * ![first_step](./READMEImages/first_step.png)
  * ![second_step](./READMEImages/second_step.png)
  * ![third_step](./READMEImages/third_step.png)


3. Install JDK 8 in order to run the project code properly
  * [Click here to install](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
  * After installing go to `Eclipse -> Preferences -> Java -> Installer JREs`
  * Click `Add` and select `Standard VM`
    * ![add_java_8_support](./READMEImages/java_8_support.png)
    * ![add_java_8_support2](./READMEImages/java_8_support2.png)
    * The path for MacOSX should be something like:  `/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home`
  * Finally click `Finish`
  * Make JRE 8 as your default option
    * ![add_java_8_support3](./READMEImages/java_8_support3.png)


4. Import all necessary libraries to the project

  * Right click on the project folder, and select `Import`
    * ![import_libs](./READMEImages/import_libs.png)
  * Select `Projects from Folder or Achieve`
    * ![import_libs2](./READMEImages/import_libs2.png)
  * Import the `lib` folder
    * ![import_libs3](./READMEImages/import_libs3.png)


5. In order to run the Authoring App, open `src/common` and execute the `EntryPoint.java` file
  * ![last_step](./READMEImages/last_step.png)


6. In order to run the SCALP App, open `src/enamel` and execute the `SCALP.java` file
  * ![last_step2](./READMEImages/last_step2.png)

## How make an Authoring App JAR

1. To build the Authoring App jar right click on the project folder and select the `Export` folder
  * ![export_jar](./READMEImages/export_jar.png)


2. Select the `Runnable JAR` option
  * ![export_jar2](./READMEImages/export_jar2.png)


3. Select the `EntryPoint - AuthoringApp` option from the drop down, mark the `Package required libraries into generate JAR` option and click `Finish`
  * ![export_jar3](./READMEImages/export_jar3.png)

## How make an SCALP JAR

1. To build the Authoring App jar right click on the project folder and select the `Export` folder
  * ![export_jar](./READMEImages/export_jar.png)


2. Select the `Runnable JAR` option
  * ![export_jar2](./READMEImages/export_jar2.png)


3. Select the `SCALP - AuthoringApp` option from the drop down, mark the `Package required libraries into generate JAR` option and click `Finish`
  * ![export_jar3](./READMEImages/export_jar3.png)

## API Documentation

* For further API documentation about every single package and class, visit the `doc` folder and open the `index.html` file.
  ![documentation](./READMEImages/documentation.png)

* To generate a more recent API documentation click on `Project -> Generate Javadoc`
  * ![generate_docs](./READMEImages/generate_docs.png)
