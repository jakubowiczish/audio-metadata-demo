## Usage Examples

## PyMediaInfo

```
PyMediaInfo

{
    "track_type": "General",
    "count": "334",
    "count_of_stream_of_this_kind": "1",
    "kind_of_stream": "General",
    "other_kind_of_stream": [
        "General"
    ],
    "stream_identifier": "0",
    "count_of_audio_streams": "1",
    "audio_format_list": "MPEG Audio",
    "audio_format_withhint_list": "MPEG Audio",
    "audio_codecs": "MPEG Audio",
    "complete_name": "KDA-MORE2.mp3",
    "file_name_extension": "KDA-MORE2.mp3",
    "file_name": "KDA-MORE2",
    "file_extension": "mp3",
    "format": "MPEG Audio",
    "other_format": [
        "MPEG Audio"
    ],
    "format_extensions_usually_used": "m1a mpa mpa1 mp1 m2a mpa2 mp2 mp3",
    "commercial_name": "MPEG Audio",
    "internet_media_type": "audio/mpeg",
    "file_size": 5548560,
    "other_file_size": [
        "5.29 MiB",
        "5 MiB",
        "5.3 MiB",
        "5.29 MiB",
        "5.292 MiB"
    ],
    "duration": 231105,
    "other_duration": [
        "3 min 51 s",
        "3 min 51 s 105 ms",
        "3 min 51 s",
        "00:03:51.105",
        "00:03:51.105"
    ],
    "overall_bit_rate_mode": "CBR",
    "other_overall_bit_rate_mode": [
        "Constant"
    ],
    "overall_bit_rate": 192000,
    "other_overall_bit_rate": [
        "192 kb/s"
    ],
    "stream_size": 1407,
    "other_stream_size": [
        "1.37 KiB (0%)",
        "1 KiB",
        "1.4 KiB",
        "1.37 KiB",
        "1.374 KiB",
        "1.37 KiB (0%)"
    ],
    "proportion_of_this_stream": "0.00025",
    "title": "KDA_MORE",
    "album": "KDAAAA",
    "album_performer": "ArtistKDA",
    "track_name": "KDA_MORE",
    "genre": "dasda",
    "recorded_date": "2021",
    "file_last_modification_date": "UTC 2021-03-17 23:22:21",
    "file_last_modification_date__local": "2021-03-18 00:22:21",
    "writing_library": "LAME3.100",
    "other_writing_library": [
        "LAME3.100"
    ],
    "copyright": "Copyrithg",
    "comment": "Essa",
    "major_brand": "dash",
    "minor_version": "0",
    "compatible_brands": "iso6mp41"
}
{
    "track_type": "Audio",
    "count": "280",
    "count_of_stream_of_this_kind": "1",
    "kind_of_stream": "Audio",
    "other_kind_of_stream": [
        "Audio"
    ],
    "stream_identifier": "0",
    "format": "MPEG Audio",
    "other_format": [
        "MPEG Audio"
    ],
    "commercial_name": "MPEG Audio",
    "format_version": "Version 1",
    "format_profile": "Layer 3",
    "format_settings": "Joint stereo",
    "mode": "Joint stereo",
    "internet_media_type": "audio/mpeg",
    "duration": 231105,
    "other_duration": [
        "3 min 51 s",
        "3 min 51 s 105 ms",
        "3 min 51 s",
        "00:03:51.105",
        "00:03:52:31",
        "00:03:51.105 (00:03:52:31)"
    ],
    "bit_rate_mode": "CBR",
    "other_bit_rate_mode": [
        "Constant"
    ],
    "bit_rate": 192000,
    "other_bit_rate": [
        "192 kb/s"
    ],
    "channel_s": 2,
    "other_channel_s": [
        "2 channels"
    ],
    "samples_per_frame": "1152",
    "sampling_rate": 44100,
    "other_sampling_rate": [
        "44.1 kHz"
    ],
    "samples_count": "10191744",
    "frame_rate": "38.281",
    "other_frame_rate": [
        "38.281 FPS (1152 SPF)"
    ],
    "frame_count": "8847",
    "compression_mode": "Lossy",
    "other_compression_mode": [
        "Lossy"
    ],
    "stream_size": 5546527,
    "other_stream_size": [
        "5.29 MiB (100%)",
        "5 MiB",
        "5.3 MiB",
        "5.29 MiB",
        "5.290 MiB",
        "5.29 MiB (100%)"
    ],
    "proportion_of_this_stream": "0.99963",
    "writing_library": "LAME3.100",
    "other_writing_library": [
        "LAME3.100"
    ]
}

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