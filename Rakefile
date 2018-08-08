task :build do
  #exec "groovyc --encoding utf-8 -d build src/main/groovy/dot/DotHi.groovy"
  system './gradlew build'
end

task try: [:build] do
  exec "groovy -cp build/classes/groovy/main script/try-lib.groovy"
  # or
  #exec "groovy -cp build/libs/dot-groovy.jar script/try-lib.groovy"
end

namespace :higradle do
  desc 'create gradle deom project'
  task :create do
    exec <<-Sh
      rm -fr higradle
      mkdir higradle
      cd higradle
      gradle init --type groovy-library
    Sh
  end

  desc 'build higradel'
  task :build do
    exec <<-Sh
      cd higradle
      #way1: gradle build
      #prefer way2: using wrapper
      ./gradlew build
    Sh
  end

  # cache in ~/.gradle
  # ./gradlew groovydoc
  # gradle build --scan
end
