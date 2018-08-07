task :build do
  #exec "groovyc -d build src/**/*.groovy"
  exec "groovyc -d build src/dot/groovy/base.groovy"
end

task :try do
  exec "groovy -cp build script/try-src.groovy"
end
