#!/bin/bash

echo "Procesando gramática..."

java -cp javacc.jar javacc Gramatica.jj

echo "Gramática compilada..."
