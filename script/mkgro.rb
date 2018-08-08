#!/usr/bin/env ruby

rbfile = ARGV[0]
abort "rbfile required!" if rbfile.nil?

rpath = Pathname(rbfile)
abort "file #{rpath.to_s} existed!" if rpath.exist?

name = rpath.basename('.groovy').to_s

tmpl = DATA.read
result = ERB.render(tmpl, binding)
rpath.write(result)
rpath.chmod(0755)
puts "file: #{rpath} generated!"
exec "vi #{rpath.to_s}"

__END__
#!/usr/bin/env groovy

println 'hi groovy'
