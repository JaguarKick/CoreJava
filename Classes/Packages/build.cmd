@echo off
javac source/*.java -d classes/
cd classes
jar cvfm ../dist/DragonBalls.jar ../manifest.mf com/*
