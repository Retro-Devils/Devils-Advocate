.class Lcom/digdroid/alman/dig/j0$z;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "z"
.end annotation


# instance fields
.field a:J

.field b:Ljava/lang/String;

.field c:I

.field final synthetic d:Lcom/digdroid/alman/dig/j0;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/j0;JLjava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$z;->d:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/digdroid/alman/dig/j0$z;->a:J

    iput-object p4, p0, Lcom/digdroid/alman/dig/j0$z;->b:Ljava/lang/String;

    iput p5, p0, Lcom/digdroid/alman/dig/j0$z;->c:I

    return-void
.end method
