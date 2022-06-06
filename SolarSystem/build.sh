javac src/*.java -d bin/
touch bin/MANIFEST.mf
echo "Manifest-Version: 1.0" > bin/MANIFEST.mf
echo "Main-Class: com.solarsystem.SolarSystem" >> bin/MANIFEST.mf
cd bin
jar -cfm SolarSystem.jar MANIFEST.mf com/*
mv SolarSystem.jar ..
cd ..
