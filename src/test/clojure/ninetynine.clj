(use 'ninetynine
      'clojure.test)


(deftest tmp
  (= 3 (mylast '(1 2 3))))


(run-tests)