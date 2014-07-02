(ns sample.core-test
  (:require [clojure.test :refer :all]
            [sample.core :refer :all]))

(deftest a-test
  (testing "Simple MongoDB query"
    (is (= "Lennon" (-main "John")))))
