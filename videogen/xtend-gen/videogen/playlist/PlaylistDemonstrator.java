package videogen.playlist;

import java.io.PrintWriter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.xtext.example.mydsl.VideoGenStandaloneSetupGenerated;
import org.xtext.example.mydsl.videoGen.AlternativeVideoSeq;
import org.xtext.example.mydsl.videoGen.MandatoryVideoSeq;
import org.xtext.example.mydsl.videoGen.OptionalVideoSeq;
import org.xtext.example.mydsl.videoGen.VideoDescription;
import org.xtext.example.mydsl.videoGen.VideoGeneratorModel;
import org.xtext.example.mydsl.videoGen.VideoSeq;
import org.xtext.example.playlist.PlaylistStandaloneSetupGenerated;
import org.xtext.example.playlist.playlist.Playlist;
import org.xtext.example.playlist.playlist.Video;
import org.xtext.example.playlist.playlist.impl.PlaylistFactoryImpl;

@SuppressWarnings("all")
public class PlaylistDemonstrator {
  public VideoGeneratorModel loadVideoGenerator(final URI uri) {
    VideoGeneratorModel _xblockexpression = null;
    {
      VideoGenStandaloneSetupGenerated _videoGenStandaloneSetupGenerated = new VideoGenStandaloneSetupGenerated();
      _videoGenStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((VideoGeneratorModel) _get);
    }
    return _xblockexpression;
  }
  
  public Playlist loadPlaylist(final URI uri) {
    Playlist _xblockexpression = null;
    {
      PlaylistStandaloneSetupGenerated _playlistStandaloneSetupGenerated = new PlaylistStandaloneSetupGenerated();
      _playlistStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((Playlist) _get);
    }
    return _xblockexpression;
  }
  
  @Test
  public void videogenToPlaylist() {
    URI _createURI = URI.createURI("test.videogen");
    VideoGeneratorModel videoGen = this.loadVideoGenerator(_createURI);
    Assert.assertNotNull(videoGen);
    EList<VideoSeq> _videoseqs = videoGen.getVideoseqs();
    int _size = _videoseqs.size();
    Assert.assertEquals(7, _size);
    PlaylistFactoryImpl playlistFactory = new PlaylistFactoryImpl();
    Playlist playlist = playlistFactory.createPlaylist();
    EList<VideoSeq> videoseqs = videoGen.getVideoseqs();
    int _size_1 = videoseqs.size();
    InputOutput.<Integer>println(Integer.valueOf(_size_1));
    for (final VideoSeq videoseq : videoseqs) {
      {
        String location = "";
        if ((videoseq instanceof MandatoryVideoSeq)) {
          VideoDescription _description = ((MandatoryVideoSeq) videoseq).getDescription();
          String _location = _description.getLocation();
          location = _location;
        } else {
          if ((videoseq instanceof OptionalVideoSeq)) {
            VideoDescription _description_1 = ((OptionalVideoSeq) videoseq).getDescription();
            String _location_1 = _description_1.getLocation();
            location = _location_1;
          } else {
            final EList<VideoDescription> alts = ((AlternativeVideoSeq) videoseq).getVideodescs();
            for (final VideoDescription alt : alts) {
              String _location_2 = alt.getLocation();
              location = _location_2;
            }
          }
        }
        Video video = playlistFactory.createVideo();
        video.setLocation(location);
        EList<Video> _videos = playlist.getVideos();
        _videos.add(video);
      }
    }
    Assert.assertNotNull(playlist);
    EList<Video> _videos = playlist.getVideos();
    int _size_2 = _videos.size();
    Assert.assertEquals(7, _size_2);
    this.playlist2text(playlist);
  }
  
  public void playlist2text(final Playlist playlist) {
    try {
      final PrintWriter writer = new PrintWriter("test.m3u", "UTF-8");
      for (int i = 0; (i < playlist.getVideos().size()); i++) {
        EList<Video> _videos = playlist.getVideos();
        Video _get = _videos.get(i);
        String _location = _get.getLocation();
        String _plus = ("file \'" + _location);
        String _plus_1 = (_plus + "\' \n");
        writer.write(_plus_1);
      }
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}