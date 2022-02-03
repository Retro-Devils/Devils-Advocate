.class Lcom/digdroid/alman/dig/f3$s;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/f3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "s"
.end annotation


# instance fields
.field a:J

.field b:Ljava/lang/String;

.field c:I

.field final synthetic d:Lcom/digdroid/alman/dig/f3;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/f3;JLjava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$s;->d:Lcom/digdroid/alman/dig/f3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/digdroid/alman/dig/f3$s;->a:J

    iput-object p4, p0, Lcom/digdroid/alman/dig/f3$s;->b:Ljava/lang/String;

    iput p5, p0, Lcom/digdroid/alman/dig/f3$s;->c:I

    return-void
.end method
