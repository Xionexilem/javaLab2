compile:
	docker exec -it java-lab javac -d /lab/bin /lab/src/*.java

run:
	docker exec -it java-lab java -cp /lab/bin Main

clean:
	rm -rf ./bin/*
