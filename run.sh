#!/bin/bash -x 
cp=target/classes
for i in $(find target/dependency -type f)
do 
    cp=${cp}:$i; 
done
java -cp ${cp} -Dexec.args="https://www.mercedes-benz.ca/"   -Djavax.net.debug=ssl:handshake:verbose -Djdk.tls.client.protocols="TLSv1.1"  net.jibits.HttpClient31 "https://www.mercedes-benz.ca/"
java -cp ${cp} -Dexec.args="https://www.mercedes-benz.ca/"   -Djavax.net.debug=ssl:handshake:verbose -Djdk.tls.client.protocols="TLSv1.1"  net.jibits.HttpClient451 "https://www.mercedes-benz.ca/"
java -cp ${cp} -Dexec.args="https://www.mercedes-benz.ca/"   -Djavax.net.debug=ssl:handshake:verbose -Djdk.tls.client.protocols="TLSv1.2"  net.jibits.HttpClient31 "https://www.mercedes-benz.ca/"
java -cp ${cp} -Dexec.args="https://www.mercedes-benz.ca/"   -Djavax.net.debug=ssl:handshake:verbose -Djdk.tls.client.protocols="TLSv1.2"  net.jibits.HttpClient451 "https://www.mercedes-benz.ca/"
echo done
