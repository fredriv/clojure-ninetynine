(ns ninetynine_test
  (:use ninetynine clojure.test))

(defn exec-last [f]
  (is (= 8 (f '(1, 1, 2, 3, 5, 8))))
  (is (nil? (f ()))))

(deftest test-mylast
  (exec-last mylast)
  (exec-last mylast2))


(run-tests)