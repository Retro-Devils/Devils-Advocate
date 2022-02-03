.class Lcom/digdroid/alman/dig/g3$r;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/g3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "r"
.end annotation


# instance fields
.field a:J

.field b:Ljava/lang/String;

.field c:I

.field final synthetic d:Lcom/digdroid/alman/dig/g3;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/g3;JLjava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$r;->d:Lcom/digdroid/alman/dig/g3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/digdroid/alman/dig/g3$r;->a:J

    iput-object p4, p0, Lcom/digdroid/alman/dig/g3$r;->b:Ljava/lang/String;

    iput p5, p0, Lcom/digdroid/alman/dig/g3$r;->c:I

    return-void
.end method
