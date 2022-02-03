.class Lfr/bmartel/youtubetv/a$d;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfr/bmartel/youtubetv/a;->G(Ljava/lang/String;ZIJFLjava/lang/String;Landroid/media/session/MediaSession;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/media/session/MediaSession;

.field final synthetic d:I

.field final synthetic e:J

.field final synthetic f:F

.field final synthetic g:Lfr/bmartel/youtubetv/a;


# direct methods
.method constructor <init>(Lfr/bmartel/youtubetv/a;ZLjava/lang/String;Landroid/media/session/MediaSession;IJF)V
    .locals 0

    iput-object p1, p0, Lfr/bmartel/youtubetv/a$d;->g:Lfr/bmartel/youtubetv/a;

    iput-boolean p2, p0, Lfr/bmartel/youtubetv/a$d;->a:Z

    iput-object p3, p0, Lfr/bmartel/youtubetv/a$d;->b:Ljava/lang/String;

    iput-object p4, p0, Lfr/bmartel/youtubetv/a$d;->c:Landroid/media/session/MediaSession;

    iput p5, p0, Lfr/bmartel/youtubetv/a$d;->d:I

    iput-wide p6, p0, Lfr/bmartel/youtubetv/a$d;->e:J

    iput p8, p0, Lfr/bmartel/youtubetv/a$d;->f:F

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/Void;
    .locals 10

    const/4 v0, 0x0

    aget-object v1, p1, v0

    iget-object v2, p0, Lfr/bmartel/youtubetv/a$d;->g:Lfr/bmartel/youtubetv/a;

    invoke-static {v2}, Lfr/bmartel/youtubetv/a;->h(Lfr/bmartel/youtubetv/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lfr/bmartel/youtubetv/i/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    aget-object p1, p1, v0

    iget-object v2, p0, Lfr/bmartel/youtubetv/a$d;->g:Lfr/bmartel/youtubetv/a;

    invoke-static {v2}, Lfr/bmartel/youtubetv/a;->h(Lfr/bmartel/youtubetv/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lfr/bmartel/youtubetv/i/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v2, p0, Lfr/bmartel/youtubetv/a$d;->g:Lfr/bmartel/youtubetv/a;

    invoke-static {v2}, Lfr/bmartel/youtubetv/a;->i(Lfr/bmartel/youtubetv/a;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getThumbnailQuality"

    invoke-static {v2, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    iget-boolean p1, p0, Lfr/bmartel/youtubetv/a$d;->a:Z

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    :try_start_1
    new-instance p1, Ljava/net/URL;

    invoke-direct {p1, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    iget-object v0, p0, Lfr/bmartel/youtubetv/a$d;->g:Lfr/bmartel/youtubetv/a;

    invoke-static {v0}, Lfr/bmartel/youtubetv/a;->i(Lfr/bmartel/youtubetv/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "BitmapFactory.decodeStream"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object p1, v2

    :goto_1
    new-instance v0, Landroid/media/MediaMetadata$Builder;

    invoke-direct {v0}, Landroid/media/MediaMetadata$Builder;-><init>()V

    iget-object v1, p0, Lfr/bmartel/youtubetv/a$d;->b:Ljava/lang/String;

    const-string v3, "android.media.metadata.TITLE"

    invoke-virtual {v0, v3, v1}, Landroid/media/MediaMetadata$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/media/MediaMetadata$Builder;

    if-eqz p1, :cond_0

    const-string v1, "android.media.metadata.ART"

    invoke-virtual {v0, v1, p1}, Landroid/media/MediaMetadata$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/media/MediaMetadata$Builder;

    :cond_0
    const/4 p1, 0x1

    move-object v4, v0

    const/4 v3, 0x1

    goto :goto_2

    :cond_1
    move-object v4, v2

    const/4 v3, 0x0

    :goto_2
    iget-object v5, p0, Lfr/bmartel/youtubetv/a$d;->c:Landroid/media/session/MediaSession;

    iget v6, p0, Lfr/bmartel/youtubetv/a$d;->d:I

    iget-wide v7, p0, Lfr/bmartel/youtubetv/a$d;->e:J

    iget v9, p0, Lfr/bmartel/youtubetv/a$d;->f:F

    invoke-static/range {v3 .. v9}, Lfr/bmartel/youtubetv/i/a;->i(ZLandroid/media/MediaMetadata$Builder;Landroid/media/session/MediaSession;IJF)V

    return-object v2
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lfr/bmartel/youtubetv/a$d;->a([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lfr/bmartel/youtubetv/a$d;->b(Ljava/lang/Void;)V

    return-void
.end method
