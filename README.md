to build 

    mvn clean compile dependency:copy-dependencies 

to run
    java -cp ${cp} -Dexec.args="https://www.mercedes-benz.ca/"   -Djavax.net.debug=ssl:handshake:verbose -Djdk.tls.client.protocols="TLSv1.2"  net.jibits.HttpClient31 "https://www.mercedes-benz.ca/"


    java -cp ${cp} -Dexec.args="https://www.mercedes-benz.ca/"   -Djavax.net.debug=ssl:handshake:verbose -Djdk.tls.client.protocols="TLSv1.2"  net.jibits.HttpClient451 "https://www.mercedes-benz.ca/"
    
