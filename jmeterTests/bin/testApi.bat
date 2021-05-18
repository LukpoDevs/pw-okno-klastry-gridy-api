del ".\jmeterResults.csv" /f /q
del ".\htmlReport\*" /f /q /s
FOR /D %%p IN (".\htmlReport\*") DO RMDIR "%%p" /s /q

jmeter -n -t ./KubernetesConfigurationsTests.jmx -l ./jmeterResults.csv -e -o ./htmlReport 