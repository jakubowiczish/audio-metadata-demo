## Usage Examples

## MediaInfo

```
MediaInfo
dict_values(['General', '334', '1', 'General', ['General'], '0', '1', 'MPEG Audio', 'MPEG Audio', 'MPEG Audio', 'KDA-MORE2.mp3', 'KDA-MORE2.mp3', 'KDA-MORE2', 'mp3', 'MPEG Audio', ['MPEG Audio'], 'm1a mpa mpa1 mp1 m2a mpa2 mp2 mp3', 'MPEG Audio', 'audio/mpeg', 5548560, ['5.29 MiB', '5 MiB', '5.3 MiB', '5.29 MiB', '5.292 MiB'], 231105, ['3 min 51 s', '3 min 51 s 105 ms', '3 min 51 s', '00:03:51.105', '00:03:51.105'], 'CBR', ['Constant'], 192000, ['192 kb/s'], 1407, ['1.37 KiB (0%)', '1 KiB', '1.4 KiB', '1.37 KiB', '1.374 KiB', '1.37 KiB (0%)'], '0.00025', 'KDA_MORE', 'KDAAAA', 'ArtistKDA', 'KDA_MORE', 'dasda', '2021', 'UTC 2021-03-17 23:22:21', '2021-03-18 00:22:21', 'LAME3.100', ['LAME3.100'], 'Copyrithg', 'Essa', 'dash', '0', 'iso6mp41'])
dict_values(['Audio', '280', '1', 'Audio', ['Audio'], '0', 'MPEG Audio', ['MPEG Audio'], 'MPEG Audio', 'Version 1', 'Layer 3', 'Joint stereo', 'Joint stereo', 'audio/mpeg', 231105, ['3 min 51 s', '3 min 51 s 105 ms', '3 min 51 s', '00:03:51.105', '00:03:52:31', '00:03:51.105 (00:03:52:31)'], 'CBR', ['Constant'], 192000, ['192 kb/s'], 2, ['2 channels'], '1152', 44100, ['44.1 kHz'], '10191744', '38.281', ['38.281 FPS (1152 SPF)'], '8847', 'Lossy', ['Lossy'], 5546527, ['5.29 MiB (100%)', '5 MiB', '5.3 MiB', '5.29 MiB', '5.290 MiB', '5.29 MiB (100%)'], '0.99963', 'LAME3.100', ['LAME3.100']])
```

## Mutagen 

```
Mutagen
{'album': ['KDAAAA'], 'copyright': ['Copyrithg'], 'title': ['KDA_MORE'], 'albumartist': ['ArtistKDA'], 'genre': ['dasda'], 'date': ['2021']}
```

## Music Metadata

```
{
  format: {
    tagTypes: [ 'ID3v2.4', 'ID3v1' ],
    trackInfo: [],
    lossless: false,
    container: 'MPEG',
    codec: 'MPEG 1 Layer 3',
    sampleRate: 44100,
    numberOfChannels: 2,
    bitrate: 192000,
    codecProfile: 'CBR',
    duration: 231.10530612244898
  },
  native: {
    'ID3v2.4': [
      { id: 'TXXX:major_brand', value: 'dash' },
      { id: 'TXXX:minor_version', value: '0' },
      { id: 'TXXX:compatible_brands', value: 'iso6mp41' },
      { id: 'TSSE', value: 'Lavf58.20.100' },
      { id: 'TIT2', value: 'KDA_MORE' },
      { id: 'TALB', value: 'KDAAAA' },
      { id: 'TPE2', value: 'ArtistKDA' },
      {
        id: 'COMM',
        value: { language: 'eng', description: '', text: 'Essa' }
      },
      { id: 'TCOP', value: 'Copyrithg' },
      { id: 'TDRC', value: '2021' },
      { id: 'TCON', value: 'dasda' }
    ],
    ID3v1: [
      { id: 'title', value: 'KDA_MORE' },
      { id: 'album', value: 'KDAAAA' },
      { id: 'comment', value: 'Essa' },
      { id: 'year', value: '2021' }
    ]
  },
  quality: { warnings: [ { message: 'Invalid ID3v2.4 frame-header-ID' } ] },
  common: {
    track: { no: null, of: null },
    disk: { no: null, of: null },
    movementIndex: {},
    encodersettings: 'Lavf58.20.100',
    title: 'KDA_MORE',
    album: 'KDAAAA',
    albumartist: 'ArtistKDA',
    comment: [ 'Essa' ],
    copyright: 'Copyrithg',
    year: 2021,
    date: '2021',
    genre: [ 'dasda' ]
  }
}

```

## Metadata Extractor

```
KDA-MORE2.mp3
5548560 bytes
Sat Mar 20 18:53:00 +01:00 2021
```

## Conclusions

The most suitable library is either music-metadata (js) or media-info (python) 