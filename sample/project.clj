(defproject sample "0.1.0-SNAPSHOT"
  :description "Clojure Sample App with MongoDB"
  :url "http://github.com/Shippable/sample_clojure_mongodb"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
  				[com.novemberain/monger "2.0.0"]]
  :main ^:skip-aot sample.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
