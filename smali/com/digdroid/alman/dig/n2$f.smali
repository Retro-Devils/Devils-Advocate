.class Lcom/digdroid/alman/dig/n2$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/n2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field a:Lcom/digdroid/alman/dig/n2$g;

.field b:I

.field c:I

.field d:Z

.field e:I

.field f:Z

.field g:I

.field h:I

.field i:I

.field j:I

.field final synthetic k:Lcom/digdroid/alman/dig/n2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/n2;)V
    .locals 1

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2$f;->k:Lcom/digdroid/alman/dig/n2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/n2$f;->d:Z

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/digdroid/alman/dig/n2$f;->e:I

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/n2$f;->f:Z

    return-void
.end method
