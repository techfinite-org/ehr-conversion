#!/bin/sh
sed -i 's/<Content>[^<]*<\/Content>//g' *.xml
sed -i 's/<docType>[^<]*<\/docType>//g' *.xml
sed -i 's/<DocumentPage>/<DocumentPage\/>/g' *.xml
sed -i 's/<\/DocumentPage>//g' *.xml
sed -i 's/ +//g' *.xml
