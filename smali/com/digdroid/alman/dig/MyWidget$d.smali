.class Lcom/digdroid/alman/dig/MyWidget$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/MyWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field a:J

.field b:Z

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Landroid/graphics/Bitmap;

.field f:I

.field final synthetic g:Lcom/digdroid/alman/dig/MyWidget;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MyWidget;)V
    .locals 2

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$d;->g:Lcom/digdroid/alman/dig/MyWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/digdroid/alman/dig/MyWidget$d;->a:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/MyWidget$d;->b:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$d;->d:Ljava/lang/String;

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$d;->e:Landroid/graphics/Bitmap;

    const/4 p1, -0x1

    iput p1, p0, Lcom/digdroid/alman/dig/MyWidget$d;->f:I

    return-void
.end method
