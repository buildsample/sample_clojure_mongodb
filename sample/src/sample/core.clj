(ns sample.core
  (:gen-class)
  (:require [monger.core :as mg]
  			[monger.collection :as mc])
  (:import [com.mongodb MongoOptions ServerAddress]
		   [org.bson.types ObjectId]
		   [com.mongodb DB WriteConcern]))

(defn -main
	[person]
	(let [conn (mg/connect)
	      db   (mg/get-db conn "test")]
		(mc/insert-batch db "documents" [{ :first_name "John" :last_name "Lennon" }
	                               { :first_name "Paul" :last_name "McCartney" }])
		(get (mc/find-one-as-map db "documents" {:first_name person}) :last_name)))
